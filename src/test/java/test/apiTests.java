package test;

import org.testng.annotations.Test;

import apiConfigs.APIPath;
import baseTest.baseClass;
import io.restassured.RestAssured;

public class apiTests extends baseClass {
	
	@Test
	public void getcall() {
		RestAssured.given().when().get(APIPath.apiPath.get_List_of_Users).then().log().all().assertThat().statusCode(200);
	}
	
	@Test
	public void getcall1() {
		RestAssured.given().when().get(APIPath.apiPath.get_single_user).then().log().all().assertThat().statusCode(200);
	}


}
