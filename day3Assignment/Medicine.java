package day3Assignment;

import java.util.Date;

public abstract class Medicine 
{
	float price;
	Date expiry_date;
	public void getDetails()
	{
		System.out.println("Price= "+price+"  Expiry Date= "+expiry_date);
	}
	public abstract void displayLable();
}
