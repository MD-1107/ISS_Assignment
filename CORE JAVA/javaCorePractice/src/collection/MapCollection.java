package collection;
import java.util.*;

public class MapCollection 
{
	//map contains pairs of keys and values where a each key is unique in nature
	//though in map, only unqiue keys are there but the values can be same for the keys
	
	public static void main(String args[])
	{
		Map<String, Integer> employee_age=new HashMap<String, Integer>();
		
		 employee_age.put("John", 28);
	     employee_age.put("Alice", 35);
	     employee_age.put("Bob", 42);
         employee_age.put("Eva", 31);
         employee_age.put("Michael", 29); 	        
         employee_age.put("Sophia", 38);
	     employee_age.put("David", 45);
	     employee_age.put("Emma", 26);
	     employee_age.put("James", 33);
	     employee_age.put("Olivia", 40);
	     
	     System.out.println(employee_age);
	     System.out.println("Size of the map: "+employee_age.size());
	     
	     System.out.println("Get Emma's age: "+employee_age.get("Emma"));
	     
	     System.out.println("Remove Emma's entry: "+employee_age.remove("Emma"));
	     
	     System.out.println("Map after removing entry of Emma: "+employee_age);
	     
	     System.out.println("Get all keys: "+employee_age.keySet());
	     
	     System.out.println("Check if Sophia present or not: "+employee_age.containsKey("Sophia"));
	     
	     System.out.println("Check if 25 years age present: "+employee_age.containsValue(25));
	}

}
