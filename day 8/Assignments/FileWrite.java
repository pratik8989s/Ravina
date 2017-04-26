package Assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite 
{
		public static void main(String[] args)
		{
				
				try 
				{
						Scanner sc=new Scanner(System.in);
						System.out.println("Enter 5 Lines");
						String s[]=new String[5];
						File f=new File("letter.txt");
						FileOutputStream fos=new FileOutputStream(f);
						char ch1='\n';
						int c=ch1;
					//	System.out.println(c);
					//	String sn="\n";
					//	byte b1[]=sn.getBytes();
						for(int i=0;i<5;i++)
						{
								s[i]=sc.nextLine();
								byte b[]=s[i].getBytes();
								fos.write(c);
								fos.write(b);
							//	fos.write(b1);
						}						
						System.out.println("Size of file= "+f.getTotalSpace());
						System.out.println("Size of file= "+f.getUsableSpace());
						System.out.println("Contents of file: ");
						FileInputStream fis=new FileInputStream(f);
						int ch;
						while((ch=fis.read())!=-1)
						{
							System.out.print((char)ch);
						}
						fis.close();
						fos.close();
						f.delete();
						System.out.println("file deleted");
				} 
				catch (FileNotFoundException e)
				{
						e.printStackTrace();
				} 
				catch (IOException e) 
				{
						e.printStackTrace();
				}	
		}
}
