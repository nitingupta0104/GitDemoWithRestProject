package apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class headerConfig {
	
	public Map<String, String> defaultHeader(){
		Map<String, String> defaultHeader = new HashMap<String, String>();
		defaultHeader.put("Content-Type", "application/json");
		defaultHeader.put("Content-Type1", "application/json1");
		return defaultHeader;
		
	}

}
