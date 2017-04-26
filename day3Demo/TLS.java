package day3Demo;

import java.util.Scanner;

public class TLS
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// Up Casting
		Person p=new Trainer(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
		p.showDetails();
		
		// Down Casting
		Trainer t=(Trainer) p;
		t.set();
	}
}
