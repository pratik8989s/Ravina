package day4Assignment;

public class Employee 
{
	int empid;
	String ename;
	
	public Employee(int empid, String ename)
	{
		super();
		this.empid = empid;
		this.ename = ename;
	}
	
	
	public int getEmpid() {
		return empid;
	}


	/*@Override
	public boolean equals(Object obj)
	{
		if(this.empid==obj.)
		return super.equals(obj);
	}*/


	public static void main(String[] args) 
	{
		Employee e1=new Employee(10,"Ravi");
		Employee e2=new Employee(10,"Ravi");
		if(e1.equals(e2))
		{
			System.out.println("Objects are equal");
		}
		else
		{
			System.out.println("Objects are not equal");
		}
		
		if(e1==e2)
		{
			System.out.println("Objects memory are equal");
		}
		else
		{
			System.out.println("Objects memory are not equal");
		}
		
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		return true;
	}
}
