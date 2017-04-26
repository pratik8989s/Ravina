package Assignments;

import java.util.Scanner;

public class TestCustomer
{
	public static void main(String[] args) 
	{
		Customer c=new Customer();
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter Customer Number:");
			c.setCustNo(sc.next());
			System.out.println("Enter Customer Name:");
			c.setCustName(sc.next());
			System.out.println("Enter Customer Category:");
			c.setCategory(sc.next());
			System.out.println(c);
		} 
		catch (InvalidInputException e) 
		{
			System.out.println(e.getMessage());
		}
		
		
		/*try {
			Customer c=new Customer("101","Ravina", "Platinum");
		} catch (InvalidInputException e) 
		{
			System.out.println();
		}*/
	}
}
