package Assignments;

public class Customer 
{
	private String custNo;
	private String custName;
	private String category;
	
	/*public Customer(String custNo, String custName, String category) throws InvalidInputException 
	{
		super();
		
		if(custNo.startsWith("C") ||  custNo.startsWith("c"))
			this.custNo = custNo;
		else
			throw new InvalidInputException("Invalid Customer Number.....");
		
		if(custName.length()<4)
			throw new  InvalidInputException("Invalid Customer Name...");
		else
			this.custName = custName;
		
		if(category.equals("Platinum") || category.equals("Gold") || category.equals("Silver") )
			this.category = category;
		else
			throw new  InvalidInputException("Invalid Customer Category......");
	}*/
	
	public String getCustNo() 
	{
		return custNo;
	}
	public void setCustNo(String custNo) throws InvalidInputException
	{
		if(custNo.startsWith("C") ||  custNo.startsWith("c"))
			this.custNo = custNo;
		else
			throw new InvalidInputException("Invalid Customer Number.....");

	}
	public String getCustName() 
	{
		return custName;
	}
	public void setCustName(String custName) throws InvalidInputException
	{
		if(custName.length()<4)
			throw new  InvalidInputException("Invalid Customer Name...");
		else
			this.custName = custName;
	}
	public String getCategory() 
	{
		return category;
	}
	public void setCategory(String category) throws InvalidInputException
	{
		if(category.equals("Platinum") || category.equals("Gold") || category.equals("Silver") )
			this.category = category;
		else
			throw new  InvalidInputException("Invalid Customer Category......");
	}
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName
				+ ", category=" + category + "]";
	}
	

}
