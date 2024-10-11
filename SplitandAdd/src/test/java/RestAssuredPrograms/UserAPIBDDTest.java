package RestAssuredPrograms;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserAPIBDDTest {
	@Test //Get
	public void testGetUserById()
	{
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
		given().when().get("users/1")
		.then()
		.statusCode(200)
		.body("id", equalTo(1))
		.body("username",not(empty()))
		.body("email", containsString("@"))
		.log().all();
		
	}

}
