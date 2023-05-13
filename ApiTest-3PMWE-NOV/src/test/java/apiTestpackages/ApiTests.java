package apiTestpackages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiTests {
	Response response;
	APIPayload apiPayload;
	
	public String  usersData() {
		return "{\r\n"
				+ "    \"first_name\": \"user163\",\r\n"
				+ "    \"last_name\": \"user164\",\r\n"
				+ "    \"email\": \"user1@codingthesmartway.com\",\r\n"
				+ "    \"favfood\": {\r\n"
				+ "        \"lunch\": \"\",\r\n"
				+ "        \"breakfast\": \"dosa\"\r\n"
				+ "    }\r\n"
				+ "}";
	}
	
	
	
	@BeforeMethod
	public void setBaseURI() {
		apiPayload = new APIPayload();
		RestAssured.baseURI="http://localhost:3000";
	}
	
	@Test (priority = 1)
	public void test_createUserAPi() {
	 response=	given()
		.body(usersData())
		.contentType(ContentType.JSON)
		.when()
		.post("/employees")
		.then()
		.log()
		.all()
		.extract()
		.response();
	
	   Assert.assertEquals(response.getStatusCode(), 201);
	   
	  JsonPath jp=  response.jsonPath();
	  int id= jp.get("id");
	  System.out.println(id);
	  Assert.assertTrue(id>0);
		
		
	}
	
	public void test_createUserAPiUsingDataMap() {
		 response=	given()
			.body(usersData())
			.contentType(ContentType.JSON)
			.when()
			.post("/employees")
			.then()
			.log()
			.all()
			.extract()
			.response();
		
		   Assert.assertEquals(response.getStatusCode(), 201);
		   
		  JsonPath jp=  response.jsonPath();
		  int id= jp.get("id");
		  System.out.println(id);
		  Assert.assertTrue(id>0);
			
			
		}
		
	@Test(priority = 2)
	public void test_deleteUser() {
		 JsonPath jp=  response.jsonPath();
		  int id= jp.get("id");
	Response response=	given()
		.when()
		.delete("/employees/"+id)
		.then()
		.log()
		.all()
		.extract()
		.response();
	
	Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority = 3)
	public void test_getSingleUser() {
		JsonPath jp=  response.jsonPath();
		  int id= jp.get("id");
     Response response=	given()
				.when()
				.get("/employees/"+id)
				.then()
				.log()
				.all()
				.extract()
				.response();
		Assert.assertEquals(response.getStatusCode(), 404);
	}

}
