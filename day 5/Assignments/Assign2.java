package Assignments;

import java.util.Scanner;

public class Assign2 
{
	int num1,num2;
	
	public Assign2(int n1,int n2)
	{
		num1=n1;
		num2=n2;
	}
	public void displayDivision() throws ArithmeticException
	{
		//if(num2==0)
		//	throw new ArithmeticException("Denominator cant be zero");
		//else
		//{
			int div=num1/num2;
			System.out.println("Division = "+div);
		//}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Assign2 a=new Assign2(sc.nextInt(),sc.nextInt());
		a.displayDivision();
		
	}
}
