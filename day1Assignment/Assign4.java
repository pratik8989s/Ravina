package day1Assignment;

import java.util.Scanner;

public class Assign4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(args[0]);
		if(n>=1 && n<=50)
		{
			int arr[]= new int[5];
			System.out.println("Enter 5 numbers: ");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			int flag=0;
			for (int i=0;i<arr.length;i++)
			{
				if (arr[i]==n)
				{
					flag=1;
					System.out.println("BINGO");
				}
			}
			if(flag==0)
			{
				System.out.println("Number not present");
			}
			
		}
		else
		{
			System.out.println("Number should be in range 1 to 50");
		}
	}

}
