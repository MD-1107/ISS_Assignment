package basic;

public class LoopDecision 
{
	//program for loops and decision making statements 
	
	public static void useLoops()
	{
		//for loop used when we have a known number of iterations
		
		for(int var=1;var<=10;var++)
		{
			System.out.print(var+"\t");
		}
		
		//while loop is used when we dont have the number of iterations but we know the condition
		int while_var=11;
		System.out.println("\n");
		while(while_var<=20)
		{
			System.out.print(while_var+"\t");
			while_var++;
		}
		
		//do while loop is used when we want to iterate the loop atleast once without even checking the condition
		System.out.println("\n");
		do {
			System.out.println(while_var+"\tDo while loop variable");
		}while(while_var<20);
	}
	
	
	public static void useDecisionMakingI()
	{
		//if else and else-if 
		//else if allows to put the condition besides if where else is true when if or else if condition is not true 
		int variable=11;
		
		for(variable=11;variable<=20;variable++)
		{
			if(variable%2==0)
			{
				System.out.println(variable+" is Even Number");
			}
			
			else if(variable%3==0)
			{
				System.out.println(variable+" is Odd Number with 3 divisible");
			}
			else 
			{
				System.out.println(variable+" is Odd Number");
			}
		}
			
	}
	
	public static void useDecisionMakingII()
	{
		//switch statements 
		for(char alphabet='A'; alphabet<='J'; alphabet++)
		{
			switch(alphabet)
			{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(alphabet+" VOWEL");
			break;
			
			default: System.out.println(alphabet+" CONSONENT"); //if no condition is satisfied this would be the case 
			break;
			}
		}
		
		
	}
	
	
	public static void main(String args[])
	{
		useLoops();
		System.out.println("\n");
		useDecisionMakingI();
		System.out.println("\n");
		useDecisionMakingII();
	}

}
