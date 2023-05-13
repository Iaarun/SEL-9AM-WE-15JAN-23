package apiTestpackages;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetApiTest {
	Response response;
	APIPayload apiPayload;
	Employees employee;
	private String firstname;
	private String userlastname;
	private String email;

	@BeforeMethod
	public void setBaseURI() {
		apiPayload = new APIPayload();
		employee = new Employees();
		RestAssured.baseURI = "http://localhost:3000";
	}

	@BeforeClass
	public void generateFakeData() {
		Faker faker = new Faker();
		firstname = faker.name().firstName();
		userlastname = faker.name().lastName();
		email = firstname + "." + userlastname + "@test.com";
	}

//	@Test
	public void test_AllemployeesApi() {
		RestAssured.baseURI = "http://localhost:3000";

		Response response = given().when().get("/employees").then().extract().response();

		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());

		System.out.println(response.getContentType());
		System.out.println(response.getHeader("Content-Encoding"));

		Assert.assertEquals(response.getStatusCode(), 200);
		String expectedbreakfast = "idli";

		JsonPath jp = response.jsonPath();
		String actualbreakfast = jp.get("[0].favfood.breakfast");
		Assert.assertEquals(actualbreakfast, expectedbreakfast);

	}

//	@Test
	public void test_createUserAPiUsingDataMap() {
		response = given().body(apiPayload.employeePayload(firstname, userlastname, email))
				.contentType(ContentType.JSON).when().post("/employees").then().log().all().extract().response();

		Assert.assertEquals(response.getStatusCode(), 201);

		JsonPath jp = response.jsonPath();
		int id = jp.get("id");
		System.out.println(id);
		Assert.assertTrue(id > 0);
		String name = jp.get("first_name");

		Assert.assertEquals(name, firstname);

	}
	
	
	@Test
	public void test_createUserAPiUsingPojo() {
		
		employee.setFirstName(firstname);
		employee.setLastName(userlastname);
		employee.setEmail(email);
	
		Employees employee1 = given().body(employee)
				.contentType(ContentType.JSON)
				.when().post("/employees")
				.then()
				.statusCode(201)
				.log()
				.all()
				.extract()
				.as(Employees.class);

//		Assert.assertEquals(response.getStatusCode(), 201);

//		JsonPath jp = response.jsonPath();
//		int id = jp.get("id");
//		System.out.println(id);
//		Assert.assertTrue(id > 0);
//		String name = jp.get("first_name");
//
//		Assert.assertEquals(name, firstname);
		
		assertThat(employee1.getFirstName(), equalTo(firstname));
		

	}

}
