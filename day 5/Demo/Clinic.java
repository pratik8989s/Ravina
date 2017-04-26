package Demo;

import java.util.Scanner;

public class Clinic
{
	public static void main(String[] args) 
	{
		Doctor d=new Doctor();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		d.setName(sc.nextLine());
		System.out.println("Enter Degree");
		String deg=sc.nextLine();
		try {
			d.setDegree(deg);
			System.out.println(d);
		} catch (DoctorException e)
		{
			System.out.println("Please enter degree");
		}
	}
}
