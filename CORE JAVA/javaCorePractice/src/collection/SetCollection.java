package collection;
import java.util.*;

public class SetCollection 
{
	//no duplicate elements allowed 
	//no direct retrieval using index. Requires iterator 
	
	public static void main(String args[])
	{
		int array[]= {10,20,30,40,30,20,10,54,203,457,29,20,30,40,100};
		
		Set<Integer> set_variable=new HashSet<Integer>();
		
		//add elements of the array to the set
		System.out.print("\nArray elements: ");
		for(int var=0;var<array.length;var++)
		{
			System.out.print(array[var]+"\t");
			set_variable.add(array[var]);
		}
		
		System.out.println("\nLength of array: "+array.length);
		
		System.out.println("\nSet Elements: "+set_variable);
		System.out.println("Size of the set: "+set_variable.size());
		
		System.out.println("Is the set empty: "+set_variable.isEmpty());
		
		System.out.println("Does the set contains 10: "+set_variable.contains(10));
		
		System.out.println("Removing the 10 from set: "+set_variable.remove(10));
		System.out.println(set_variable);
		
		System.out.println("Does the set contains 10: "+set_variable.contains(10));
		
		
		
	}

}
