package basic;

import java.util.*;

public class StringArray
{

    public static void useStringFunctions(String string_variable)
    {
    	System.out.println("\nString: "+string_variable);
    	System.out.println("String length: "+string_variable.length());
    	System.out.println("First character of the string: "+string_variable.charAt(0));
    	
    	System.out.println("Get first three letters: "+ string_variable.substring(3));
    	System.out.println("Get index of letter e: "+string_variable.indexOf('e'));
    	
    	System.out.println("Convert to lower case: "+string_variable.toLowerCase());
    	System.out.println("Concat with Good Morning: "+string_variable.concat(" Good Morning"));
    }

    public static void useArrays(int array[])
    {
    	int sum=0;
    	System.out.println("\n\nThe Numbers are: ");
    	for(int var=0;var<array.length;var++)
    	{
    		sum+=array[var];
    		System.out.print(array[var]+"\t");
    	}
    	System.out.println("\nSum: "+sum);
    	System.out.println("Number at last index: "+array[array.length-1]);
    	System.out.println("2nd number in the array: "+array[1]);
    }

    public static void main(String args[])
    {
        Scanner scanner_object=new Scanner(System.in);
        
        System.out.print("Enter random string: ");
        useStringFunctions(scanner_object.nextLine());
        
        System.out.println("\n");
        
        System.out.print("Enter 10 numbers: ");
        int array[]=new int[10];
        for(int var=0;var<10;var++)
        {
        	array[var]=scanner_object.nextInt();
        }
        useArrays(array);
        
    }

    
}
