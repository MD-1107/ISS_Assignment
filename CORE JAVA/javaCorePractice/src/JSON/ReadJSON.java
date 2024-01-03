package JSON;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.io.*;
import org.json.simple.parser.*;

public class ReadJSON 
{
	public static void main(String args[])
	{
	JSONParser jsonParser=new JSONParser();
	
	try 
	{
		FileReader reader=new FileReader("JSONFile.json");
		
		Object object=jsonParser.parse(reader);
		
		JSONArray empList=(JSONArray)object;
		
		System.out.println(empList);
		
		empList.forEach(emp -> parseData((JSONObject)emp));

	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	public static void parseData(JSONObject emp)
	{
		JSONObject empObject=(JSONObject)emp.get("employee");
		
		String fname=(String)empObject.get("firstname");
		String lname=(String)empObject.get("lastname");
		String website=(String)empObject.get("website");
		
		
		System.out.println("Firstname: "+fname);
		System.out.println("Lastname: "+lname);
		System.out.println("Website: "+website);
	}
}
