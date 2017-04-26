package day1Assignment;

public class Assign1
{

	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		System.out.println("Even numbers less then "+n);
		for(int i=1; i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(" "+i);
			}
		}

	}

}
