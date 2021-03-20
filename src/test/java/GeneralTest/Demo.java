package GeneralTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo {
	
	
	
	@Test
	public void getMethod() {
		RestAssured.baseURI="https://reqres.in/api/users";
		//RestAssured.given().when().get("https://reqres.in/api/users?page=2").then().log().all();
		Response response= RestAssured.given().param("page", 2).when().get();
		
		System.out.println("Response body = " +response.getBody().asString());
		System.out.println("Content type = " +response.getContentType());
		System.out.println("Status Code = " +response.getStatusCode());
		
	}
	
	@Test
	public void postMethod() {
		RestAssured.baseURI="https://reqres.in/api/users";
		String json="{\\r\\n\" + \r\n" + 
				"				\"    \\\"Nitin\\\": \\\"Gupta\\\",\\r\\n\" + \r\n" + 
				"				\"    \\\"job\\\": \\\"leader\\\"\\r\\n\" + \r\n" + 
				"				\"}";
		RestAssured.given().body(json).post("").then().log().all();
		
	}

}
