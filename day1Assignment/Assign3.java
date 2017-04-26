package day1Assignment;

public class Assign3
{
	public static void main(String[] args)
	{
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		char c=args[2].charAt(0);
		if(c=='+')
					System.out.println("Addition is "+(n1+n2));
		else if(c=='-')	
					System.out.println("Substraction  is "+(n1-n2));
		else if(c=='*')		
					System.out.println("multiplication is "+(n1*n2));
		else if(c=='/')
					System.out.println("division is "+(n1/n2));
		else
					System.out.println("Wrong choice");
			
	}
}
