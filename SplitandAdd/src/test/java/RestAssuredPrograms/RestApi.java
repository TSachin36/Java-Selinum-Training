package RestAssuredPrograms;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class RestApi {

    @BeforeClass
    public void setup() {
        // Set the base URI for REST Assured
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void testGetPost() {
        // GET /posts/1
        Response response = RestAssured.get("/posts/1");

        // Validate status code
        Assert.assertEquals(response.getStatusCode(), 200);

        // Validate specific response data
        int id = response.jsonPath().getInt("id");
        Assert.assertEquals(id, 1);

        // Check that the title matches the expected title for post with ID 1
        String expectedTitle = "sunt aut facere repellat provident occaecati excepturi optio reprehenderit";
        String actualTitle = response.jsonPath().getString("title");
        Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch for the post with ID 1");

        // Validate the response schema
        response.then().assertThat().body(matchesJsonSchemaInClasspath("post-schema.json"));
    }

    @Test
    public void testGetComments() {
        // GET /posts/1/comments
        Response response = RestAssured.get("/posts/1/comments");

        // Validate status code
        Assert.assertEquals(response.getStatusCode(), 200);

        // Validate response data
        Assert.assertTrue(response.jsonPath().getList("$").size() > 0);
        Assert.assertEquals(response.jsonPath().getInt("[0].postId"), 1);
    }

    @Test
    public void testCreatePost() {
        // Request data for POST
        String requestBody = "{\n" +
                " \"title\": \"foo\",\n" +
                " \"body\": \"bar\",\n" +
                " \"userId\": 1\n" +
                "}";

        // POST /posts
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post("/posts");

        // Validate status code
        Assert.assertEquals(response.getStatusCode(), 201);

        // Validate response data
        String title = response.jsonPath().getString("title");
        Assert.assertEquals(title, "foo");

        int userId = response.jsonPath().getInt("userId");
        Assert.assertEquals(userId, 1);

        // Validate the response schema for the newly created post
        response.then().assertThat().body(matchesJsonSchemaInClasspath("post-schema.json"));
    }

    @Test
    public void testDeletePost() {
        // DELETE /posts/1
        Response response = RestAssured.delete("/posts/1");

        // Validate status code
        Assert.assertEquals(response.getStatusCode(), 200);

        // Log the response body
        String responseBody = response.getBody().asString();
        System.out.println("Response Body after DELETE: " + responseBody);

        // Check if the body is empty
        Assert.assertTrue(responseBody.isEmpty(), "Expected empty response body after DELETE");
    }
}

