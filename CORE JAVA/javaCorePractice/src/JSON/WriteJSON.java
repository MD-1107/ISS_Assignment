package JSON;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.io.*;

public class WriteJSON 
{
    public static void main(String[] args) {
        JSONObject emps = new JSONObject();
        emps.put("firstname", "Jason");
        emps.put("lastname", "Cox");
        emps.put("website", "www.jsonc.com");

        JSONObject empObj = new JSONObject();
        empObj.put("employee", emps);

        JSONObject emps2 = new JSONObject();
        emps2.put("firstname", "Amy");
        emps2.put("lastname", "Wang");
        emps2.put("website", "www.amw.com");

        JSONObject empObj2 = new JSONObject();
        empObj2.put("employee", emps2);

        JSONArray empList = new JSONArray();
        empList.add(empObj);
        empList.add(empObj2);

        System.out.println(empList.toString());
        
        try 
        {
        FileWriter fileWrite=new FileWriter("JSONFile.json");	
        fileWrite.write(empList.toString());
        fileWrite.flush();
        }
        
        catch(Exception e)
        {
        	System.out.println(e+"\tException occured");
        }
    }
    
}
