package RestAssuredPrograms;

import org.testng.annotations.Test;
//import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
/*import static io.restassured.matcher.RestAssuredMatchers.*/
import io.restassured.path.json.JsonPath;
import io.restassured.RestAssured;

public class RestAssuredDemo1 {
	@Test (enabled=false)
	public void getUsers()
	{
		// 3 methods used in RestAssured -> given() when() then()
		//given() - Content type, set cookies, add auth, add params, set headers etc
		//when() - get post put delete
		//then() - validate status code, extract response, extracgt header & body...
		
		//given()
		
		when()
			.get("https://reqres.in/api/users?page=3")
		
		.then()
		.statusCode(200)
		.body("page",equalTo(3))
		.log().all();		
	}
	
	@Test (enabled=false)
    public void testGetUsers() {
        // Set the base URL for the API
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        // Perform a GET request and validate the response
        given().
                when().
                get("/users").
                then().
                statusCode(200).                 // Verify HTTP status code 200
                body("size()", greaterThan(0)).  // Check that the response contains users
                body("[0].username", equalTo("Bret"));  // Verify the username of the first user
    }
	
	
	 
	}




