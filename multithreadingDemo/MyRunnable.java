package multithreadingDemo;

public class MyRunnable implements Runnable
{
		public void run()
		{
				System.out.println("Hi!!!!!!!!!!");
		}
		
		public static void main(String[] args)
		{
				MyRunnable m=new MyRunnable();
				Thread t=new Thread(m);
				t.start();
				
		}
}
