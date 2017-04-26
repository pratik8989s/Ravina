package day6Assignments;

/*public class MyThread extends Thread 
{

	public void run() 
	{
		super.run();
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());
	}
}*/
public class MyThread implements Runnable 
{
	
	public void run() 
	{
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());
	}
}