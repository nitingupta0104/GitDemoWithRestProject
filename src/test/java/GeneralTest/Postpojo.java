package GeneralTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.Given;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.CreateUserPojo;

public class Postpojo {
	
	


	@Test
	public void postpojo() {
		CreateUserPojo p=new CreateUserPojo("morpheus", "leader");

		
		Response response =RestAssured.given().body(p).when().post("https://reqres.in/api/users");
		System.out.println(response.getBody().asString());
	}

}
