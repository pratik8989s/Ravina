package Assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DirectoryList
{
		public static void main(String[] args) 
		{				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter directory name: ");
				String s=sc.nextLine();
				File f=new File(s);
				if(f.isDirectory())
				{
						String files[]=f.list();
						for(int i=0;i<files.length;i++)
						{
							System.out.println(files[i]);
						}
				}
				
		}
}
