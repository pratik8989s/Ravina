package day1Assignment;

public class Assign2 
{
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			sum=sum+ Integer.parseInt(args[i]);
		}
		System.out.println("Sum is "+sum);
		int avg=sum/args.length;
		System.out.println("Average is "+avg);
	}
}
