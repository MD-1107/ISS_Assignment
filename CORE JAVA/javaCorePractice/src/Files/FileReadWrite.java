package Files;

import java.io.*;
import java.util.*;

public class FileReadWrite 
{
	public static void main(String args[])
	{
		String string="File Handling Operations Test";
		
		//file writing operations 
		try 
		{
		FileWriter fileWriteObject=new FileWriter("sample.txt");
		
		for(int var=0;var<string.length();var++)
		{
			fileWriteObject.write(string.charAt(var));
		}
		
		System.out.println("File Writing is successful");
		
		fileWriteObject.close();
		}
		
		catch (Exception e)
		{
			System.out.println("Exception is caught");
		}
		
		
		//file reading operations
		
		try
		{
			FileReader fileReadObject=new FileReader("sample.txt");
			
			int var;
			System.out.println("The text in the file is: \n");
			while((var=fileReadObject.read())!=-1)
			{
				System.out.print((char)var);
			}
			
			fileReadObject.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}

}
