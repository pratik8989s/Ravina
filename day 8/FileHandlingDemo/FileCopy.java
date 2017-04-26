package FileHandlingDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis=new FileInputStream("data.txt");
			FileOutputStream fos=new FileOutputStream("source.txt");
			
			int ch;
			while((ch=fis.read())!=-1)
			{
				fos.write(ch);
			}
			
			fis.close();
			fos.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
	}
}
