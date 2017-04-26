package day3;

import java.util.Scanner;

public class FlashCardTest 
{
		public static void main(String[] args) 
		{
			 	Scanner sc=new Scanner(System.in);
				FlashCardsData fc= new FlashCardsData();
		
				/*for(int i=0;i<3;i++)
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
				}*/
				
				/*System.out.println("Enter subject to search card:");
				String sub=sc.next();
				try 
				{
					System.out.println(fc.searchCard(sub));
				} 
				catch (CardNotFoundException e) 
				{					
					//e.printStackTrace();
				}*/
				
				fc.loadData();
		}
}
