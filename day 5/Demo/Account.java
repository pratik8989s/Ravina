package Demo;

public class Account 
{
	private String accId;
	private String accType;
	public String getAccId() 
	{
		return accId;
	}
	public void setAccId(String accId) throws AccountException
	{
		if(accId.startsWith("ACC")&&accId.length()==6)
		{
			this.accId = accId;
		}
		else
		{
			throw new AccountException("Account ID is invalid.....");
		}
	}
	public String getAccType() 
	{
		return accType;
	}
	public void setAccType(String accType)
	{
		this.accType = accType;
	}
	@Override
	public String toString() 
	{
		return "Account [accId=" + accId + ", accType=" + accType + "]";
	}	
}
