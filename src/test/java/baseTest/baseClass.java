package baseTest;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import utils.FileAndEnv;

public class baseClass {
	
	@BeforeClass
	public void baseURI() {
//		RestAssured.baseURI=FileAndEnv.fileandenv.;
	}

}
