package day6Assignments;

public class ThreadDemo
{
	public static void main(String[] args)
	{
		/*MyThread m1=new MyThread();
		m1.setName("M1");
		MyThread m2=new MyThread();
		m2.setName("M2");
		m1.start();
		m2.start();*/
		
		Runnable r=new MyThread();
		Thread t1=new Thread(r,"T1");
		Thread t2=new Thread(r,"T2");
		t1.setPriority(3);
		t2.setPriority(7);
		t1.start();
		t2.start();
	}
}
