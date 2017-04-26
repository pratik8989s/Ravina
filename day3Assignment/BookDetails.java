package day3Assignment;

import java.util.Scanner;

public class BookDetails 
{
	public static void main(String[] args) 
	{	
		Scanner sc=new  Scanner(System.in);
		//Book b1=new Book(101,"Vishal","Patil",500000);
		//System.out.println("Book no= "+b1.getBookNo()+" Title= "+b1.getTitle()+" Author= "+b1.getAuthor()+" Price= "+b1.getPrice());
		System.out.println("Enter Book no");
		int bookid=sc.nextInt();
		System.out.println("Enter Book Title");
		String title=sc.next();
		System.out.println("Enter Auther Name");
		String athr=sc.next();
		System.out.println("Enter Price");
		float prc=sc.nextFloat();
		
		//Book b=new Book(bookid,title,athr,prc);
		Book b2=new Book();
		b2.setBookNo(bookid);
		b2.setTitle(title);
		b2.setAuthor(athr);
		b2.setPrice(prc);
				
		System.out.println(b2);
	
	}
}
