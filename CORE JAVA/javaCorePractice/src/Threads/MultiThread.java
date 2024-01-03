package Threads;

public class MultiThread extends Thread
{
	Thread thread;
	String thread_name;
	
	MultiThread(String thread_name)
	{
		this.thread_name=thread_name;
		System.out.println("Creating thread: "+thread_name);
	}
	
	public void run()
	{
		System.out.println("The Running Thread: "+thread_name);
		
		try 
		{
			for(int var=10; var>0; var--)
			{
				System.out.println("Thread: "+thread_name+" , "+var);
				
				Thread.sleep(100);
			}
		}
		
		catch(Exception e)
		{
			System.out.println("Exception in thread: "+thread_name);
		}
		System.out.println("Thread: "+thread_name+"\tis Exiting");
	}
	
	public void start()
	{
		System.out.println("Starting: "+thread_name);
		
		if(thread==null)
		{
			thread=new Thread(this, thread_name);
			
			thread.start();
		}
		
	}
	public static void main(String args[])
	{
		MultiThread thread1=new MultiThread("Thread 1");
		
		MultiThread thread2=new MultiThread("Thread 2");
		
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
