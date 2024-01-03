package basic;

public class ConstructorFinal 
{
	int number;
	static final int final_number=10;//this value cannot be changed anywhere 
	
	ConstructorFinal() //deparameterized constructor
	{
		number=50;
	}
	
	ConstructorFinal(int val) //parameterized constructor 
	{
		number=val;
	}
	
	public static void main(String args[])
	{
		ConstructorFinal nonparameterized_object=new ConstructorFinal();
		
		ConstructorFinal parameterized_object=new ConstructorFinal(100);
		
		System.out.println("Non-paramterized Constructor: "+nonparameterized_object.number);
		System.out.println("Paramterized Constructor: "+parameterized_object.number);
		System.out.println("\nFinal Variable: "+final_number);
	}

}
