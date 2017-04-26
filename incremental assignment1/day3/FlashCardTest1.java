package day3;

import java.util.Scanner;

public class FlashCardTest1 extends Thread 
{
	public static void main(String[] args) 
	{
		 	Scanner sc=new Scanner(System.in);
			FlashCardsData1 fc= new FlashCardsData1();
	
		/*	for(int i=0;i<3;i++)
			{
					FlashCard fc1=new FlashCard();
					System.out.println("Enter Subject: ");
					String subject=sc.nextLine();
					fc1.setSubject(subject);
					System.out.println("Enter Question: ");
					String question=sc.nextLine();
					fc1.setQuestion(question);
					System.out.println("Enter Answer: ");
					String answer=sc.nextLine();
					fc1.setAnswer(answer);
					fc.myCardsList.add(fc1);
			}*/
			fc.loadData();
			System.out.println("Enter subject to search card:");
			String sub=sc.next();
			try 
			{
				System.out.println(fc.searchCard(sub).getQuestion());
				sleep(2000);
				System.out.println(fc.searchCard(sub).getAnswer());
			} 
			catch (CardNotFoundException e) 
			{					
				//e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
