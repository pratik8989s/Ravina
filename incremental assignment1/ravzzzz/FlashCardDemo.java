package ravzzzz;

import java.util.Arrays;
import java.util.Scanner;

public class FlashCardDemo 
{
		public static void main(String[] args) 
		{
				Scanner sc=new Scanner(System.in);
				FlashCard f[]=new FlashCard[3];
				for(int i=0;i<3;i++)
				{
						f[i]=new FlashCard();
						System.out.println("Enter Subject: ");
						String subject=sc.nextLine();
						f[i].setSubject(subject);
						System.out.println("Enter Question: ");
						String question=sc.nextLine();
						f[i].setQuestion(question);
						System.out.println("Enter Answer: ");
						String answer=sc.nextLine();
						f[i].setAnswer(answer);			
						
				}
				//Arrays.sort(f);
				for(int i=0;i<3;i++)
				{
					System.out.println(f[i]);
				}
		}
}
