package FileHandlingDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PizzaHut 
{
	public static void main(String[] args) 
	{
		Pizza p=new Pizza("simple", 5);	
		
		try 
		{
			//1.Serialization-----  FOS, OOS
			FileOutputStream fos=new FileOutputStream("pizzinfo.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(p);
			fos.close();
			oos.close();
			
			//1.DeSerialization-----  FIS, OIS
			FileInputStream fis=new FileInputStream("pizzinfo.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Pizza p1=(Pizza) ois.readObject();
			System.out.println(p1);
			fis.close();
			ois.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
