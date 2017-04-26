package day3;

import java.util.Scanner;

public class DisplayThread extends Thread
{
	static FlashCardsData fc;
	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			 fc= new FlashCardsData();
	
			for(int i=0;i<3;i++)
			{
					fc.fc1[i]=new FlashCard();
					System.out.println("Enter Subject: ");
					String subject=sc.nextLine();
					fc.fc1[i].setSubject(subject);
					System.out.println("Enter Question: ");
					String question=sc.nextLine();
					fc.fc1[i].setQuestion(question);
					System.out.println("Enter Answer: ");
					String answer=sc.nextLine();
					fc.fc1[i].setAnswer(answer);
			}
			
			
				DisplayThread dt=new DisplayThread();
				dt.start();
		}

		public void run() 
		{
				super.run();
				for(int i=0;i<3;i++)
				{
					System.out.println(fc.fc1[i]);
					try 
					{
						sleep(2000);
					} 
					catch (InterruptedException e) 
					{
						//e.printStackTrace();
					}
				}
		}
		
		
}
