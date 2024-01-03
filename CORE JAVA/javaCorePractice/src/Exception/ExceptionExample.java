package Exception;

public class ExceptionExample 
{
	static void help()
	{
		try
		{
			throw new NullPointerException("unknown error");
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Caught the exception inside help() method");
			throw e;
		}
	}
	
	static void fun() throws IllegalAccessException
	{
		System.out.println("\n\nInside the fun method successfully");
		throw new IllegalAccessException("demo");
	}
	
	public static void main(String args[])
	{
		try{
			help();
		}
		
		catch(Exception e)
		{
			System.out.println("\nException from help method caught in the main method");
			System.out.println(e);
		}
		
		finally 
		{
			try 
			{
				fun();
			}
			catch(Exception e)
			{
				System.out.println("\nException from fun method caught in main method");
				System.out.println(e);
			}
		}
	}
	

}
