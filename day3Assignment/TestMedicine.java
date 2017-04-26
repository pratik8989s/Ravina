package day3Assignment;

import java.util.Random;

public class TestMedicine 
{
	public static void main(String[] args)
	{
		Medicine m[]=new Medicine[5];
		Random r = new Random();
		
		for(int i=0;i<m.length;i++)
		{
			int rn=r.nextInt(3)+1;
			if(rn==1)
			{
				 m[i]=new Tablet();
				m[i].displayLable();
			}
			else if(rn==2) 
			{
				m[i]=new Syrup();
				m[i].displayLable();
			}
			else if(rn==3) 
			{
				m[i]=new Ointment();
				m[i].displayLable();
			}
			else if(rn==0)
			{
				System.out.println("OOOOOOOOOOOoooooooooooooooooooooooo");
			}
		}
	}
}
