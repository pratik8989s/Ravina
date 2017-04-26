package FileHandlingDemo;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritePizzaToFile 
{
		public static void main(String[] args) 
		{
				//1.Create an object
				Pizza p=new Pizza("Simple", 5);
				
				//2.Write an object into file-FOS,DOS
				try 
				{
					FileOutputStream fos=new FileOutputStream("pizz.txt");
					DataOutputStream dos=new DataOutputStream(fos);
					dos.writeBytes(p.toString());
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
