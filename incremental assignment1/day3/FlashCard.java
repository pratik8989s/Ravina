package day3;

public class FlashCard extends Card
{
		private String subject;
		private String question;
		private String answer;
		
		/*public FlashCard(String subject, String question, String answer) {
			super();
			this.subject = subject;
			this.question = question;
			this.answer = answer;
		}*/
		public String getSubject() 
		{
			return subject;
		}
		public void setSubject(String subject)
		{
			this.subject = subject;
		}
		public String getQuestion()
		{
			return question;
		}
		public void setQuestion(String question)
		{
			this.question = question;
		}
		public String getAnswer()
		{
			return answer;
		}
		public void setAnswer(String answer) 
		{
			this.answer = answer;
		}
		
		@Override
		public String toString() 
		{
			return "FlashCard [subject=" + subject + ", question=" + question
					+ ", answer=" + answer + "]";
		}
		public void displayCard()
		{
			System.out.println("FlashCard [subject=" + subject + ", question=" + question
					+ ", answer=" + answer + "]");
		}
		
}
