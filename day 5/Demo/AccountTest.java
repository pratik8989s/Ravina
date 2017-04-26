package Demo;

import java.util.Scanner;

public class AccountTest 
{
	public static void main(String[] args) 
	{
		Account a=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account ID");
		try
		{
			a.setAccId(sc.next());
			System.out.println("Enter Account Type");
			a.setAccType(sc.next());
			System.out.println(a);
		}
		catch (AccountException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
