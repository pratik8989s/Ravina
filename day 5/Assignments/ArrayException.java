package Assignments;

import java.util.Scanner;

public class ArrayException 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers");
		try
		{
			int arr[]=new int[10];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Wrong Index....");
		}
	}
}
