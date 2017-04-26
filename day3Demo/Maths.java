package day3Demo;

public class Maths 
{
	int add(int n1,int n2)
	{
		return (n1+n2);
	}
	double add(double n1,int n2)
	{
		return (n1+n2);
	}
	float add(int n1,float n2)
	{
		return (n1+n2);
	}
	public static void main(String[] args)
	{
		Maths m=new Maths();
		System.out.println(m.add(10, 20));
		System.out.println(m.add(3.5, 20));
		System.out.println(m.add(20, 25.5f));
	}
}
