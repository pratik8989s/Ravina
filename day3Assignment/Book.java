package day3Assignment;

public class Book 
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	
	
	public Book() 
	{
		super();
	}
	
	public Book(int bookNo, String title, String author, float price) 
	{
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getBookNo() 
	{
		return bookNo;
	}
	public void setBookNo(int bookid) 
	{
		bookNo = bookid;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", author="
				+ author + ", price=" + price + "]";
	}

	
	
}
