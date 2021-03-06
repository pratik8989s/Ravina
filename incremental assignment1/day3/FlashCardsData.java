package day3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FlashCardsData implements CardSearchable 
{
	FlashCard fc1[]=new FlashCard[3];
	int flag=0;
	FlashCard fc;
	public Card searchCard(String sub) throws CardNotFoundException 
	{
		
		for(int i=0;i<fc1.length;i++)
		{			
				if(fc1[i].getSubject().equalsIgnoreCase(sub))
				{
					flag=1;
					fc=fc1[i];
				}
		}
		if (flag==0)
		{
			throw new CardNotFoundException("The card you are looking for is not available");
		}
		else
		{
			return fc;
		}
	}
	
	public void loadData()
	{
		File f=new File("cards_data.txt");
		FileReader fr=null;
		try 
		{
			fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String sh;
			while((sh=br.readLine())!=null)
			{
				FlashCard fc=new FlashCard();
				StringTokenizer st=new StringTokenizer(sh, ";");
				while(st.hasMoreTokens())
				{
					String subject=st.nextToken();
					String question=st.nextToken();
					String answer=st.nextToken();
					fc.setSubject(subject);
					fc.setQuestion(question);
					fc.setAnswer(answer);
					
				}
			}
				
			/*int ch;
			while((ch=fr.read())!=-1)
			{
				System.out.print((char)ch);
			}*/
		} 
		catch (FileNotFoundException e) 
		{
			//e.printStackTrace();
		} 
		catch (IOException e) 
		{
			//e.printStackTrace();
		}
		finally
		{
			try 
			{
				fr.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
