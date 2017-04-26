package day3Demo;

public abstract class Person 
{
	String fname;
	String lname;
	String address;
	
	
	public Person(String fname, String lname, String address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}


	public String getFname() {
		return fname;
	}


	public String getLname() {
		return lname;
	}


	public String getAddress() {
		return address;
	}


	public abstract void showDetails();
}
