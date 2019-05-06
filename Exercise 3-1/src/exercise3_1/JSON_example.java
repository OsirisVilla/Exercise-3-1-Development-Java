package exercise3_1;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSON_example {
	
	
	
	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();
		 
        try {
        	
        	FileReader reader = new FileReader("/Users/hector.villa/eclipse-workspace/udemy_course/Exercise 3-1/json_sdet.json");
 
            Object obj = parser.parse(reader);
            
           
      
            JSONObject jsonObject = (JSONObject) obj;
            
            JSONObject oli = (JSONObject) jsonObject.get("AppSettings");
          
 
            String BaseUrl = (String) oli.get("BaseUrl");
            String BrowserTarget = (String) oli.get("BrowserTarget");
           
 
            System.out.println("BaseUrl: " + BaseUrl);
            System.out.println("BrowserTarget: " + BrowserTarget);
            
          
            
 
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
