package Threads;


class PrintingData
{
	public void printCount()
	{
		try 
		{
			for(int var=5; var>0; var--)
			{
				System.out.println("Counter -- "+var);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}

class ThreadWithoutSyn extends Thread 
{
	Thread thread;
	String threadName;
	PrintingData printData;
	
	ThreadWithoutSyn(String name, PrintingData printData)
	{
		threadName=name;
		this.printData=printData;
	}
	
	public void start()
	{
		System.out.println("Starting Thread: "+threadName);
		
		if(thread==null)
		{
			thread=new Thread(this, threadName);
			thread.start();
		}
	}
	
	public void run()
	{
		synchronized(printData) 
		{
		printData.printCount();
		}
		System.out.println("Thread "+threadName+"\tis Exiting");
	}
	
}

public class Synchronization 
{
	public static void main(String args[])
	{
		PrintingData printDataObject=new PrintingData();
		
		ThreadWithoutSyn thread1=new ThreadWithoutSyn("Thread1", printDataObject);
		ThreadWithoutSyn thread2=new ThreadWithoutSyn("Thread2", printDataObject);
		
		thread1.start();
		thread2.start();
		
		try 
		{
	         thread1.join();
	         thread2.join();
	    } 
		catch ( Exception e) {
	         System.out.println("Interrupted");
	      }
		
	}
}
