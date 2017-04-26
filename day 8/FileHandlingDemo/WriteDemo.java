package FileHandlingDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDemo 
{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			try 
				{
				/*	// FileWriter
					FileWriter fw=new FileWriter("data.txt");
					System.out.println("Enter data");
					fw.write(sc.next());
					fw.close();*/
					
					//FileReader
					/*FileReader fr=new FileReader("data.txt");
					int ch;
					while((ch=fr.read())!=-1)
					{
						System.out.print((char)ch);
						
					}
					fr.close();*/
					
				/*	//FileOutputStream
					FileOutputStream fos=new FileOutputStream("data.txt");
					String s="xyz";
					byte b[]=s.getBytes();
					fos.write(b);
				*/
					
					//FileInputStream
					FileInputStream fis=new FileInputStream("data.txt");
					BufferedInputStream bis=new BufferedInputStream(fis);
					int chl;
					while((chl=bis.read())!=-1)
					{
						System.out.print((char)chl);	
					}
					
				/*	FileOutputStream fos=new FileOutputStream("data.txt");
					BufferedOutputStream bos=new BufferedOutputStream(fos);
					String d="dsflik23513748dhsflg";
					byte bt[]=d.getBytes();
					bos.write(bt);
					bos.close();
					fos.close();*/
					
					
					
					
					
					
					
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
		}
}
