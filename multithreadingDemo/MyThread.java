package multithreadingDemo;

public class MyThread extends Thread
{
	public MyThread()
	{
		setName("t1");
		start();
	}
	public void run()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) 
	{
		new MyThread();
		/*MyThread m=new MyThread();
		System.out.println("Raina");
		m.start();
		m.s
		System.out.println("main");*/
	}
}
