package day1Assignment;

import java.util.Arrays;

public class Assign5
{
	public static void main(String[] args)
	{
		String arr[]={"lmn", "pqr","abc"};
		String arrr[]=new String[3];
		for(int i=0;i<arr.length;i++)
		{
			char[] c=arr[i].toCharArray();
			char[] c1=new char[c.length];
			for(int j=c.length-1, k=0;j>=0;j--,k++)
			{				
				c1[k]=c[j];
			}
			arrr[i]=new String(c1);
			System.out.println(arr[i]+"   "+arrr[i]);
		}
		Arrays.sort(arrr);
		for(int i=0;i<arrr.length;i++)
		{
			System.out.println(arrr[i]);
		}
	}
}
