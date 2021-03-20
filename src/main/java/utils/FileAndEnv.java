package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileAndEnv {
	
	public static Map<String, String> fileandenv= new HashMap<String, String>();
	public static Properties propMain= new Properties();
	
	public static Map<String, String> Envandfile(){
		String Environment =System.getProperty("env");
		
	try {
		if (Environment.equalsIgnoreCase("dev")) {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/Inputs/dev.properties");
			propMain.load(file);
			fileandenv.put("ServerURL", "ServerURL");
			fileandenv.put("portNo", "portNo");
			fileandenv.put("username", "User");
			fileandenv.put("password", "Admin");			
		}
		
		else {
			FileInputStream file1 = new FileInputStream(System.getProperty("user.dir")+"/Inputs/qa.properties");
			propMain.load(file1);
			fileandenv.put("ServerURL", "ServerURL");
			fileandenv.put("portNo", "portNo");
			fileandenv.put("username", "User");
			fileandenv.put("password", "Admin");				
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}		
		return fileandenv;
		
	}
	
	Map<String, String> getConfigReader(){
		if (fileandenv == null) {
			fileandenv= Envandfile();
		}
		
		return fileandenv;
		
	}
	
	
}
