package Demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=0;
		int den=0;
		try 
		{
			System.out.println("Enter Numerator");
			num = sc.nextInt();
			System.out.println("Enter Denomenator");
			den = sc.nextInt();
			float ans=num/den;
			System.out.println("Answer= "+ans);
		} 
		catch (InputMismatchException e) 
		{
			System.out.println("Please enter Numerical values...");
		}		
		catch(ArithmeticException a)
		{
			System.out.println("Please Enter non zero value for Denominator..... ");
		}
		
	}
}
