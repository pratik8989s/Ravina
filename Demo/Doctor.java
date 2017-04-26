package Demo;

import java.util.Scanner;

public class Doctor implements MyInterface 
{	
	String degree;
	String name;
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		this.degree=sc.next();
		this.name=sc.next();
	}
	public void display() 
	{
		System.out.println(this.degree+"    "+this.name);
	}
}
