package day3Demo;

public class Trainer extends Person
{
	private int no_of_skills;
	private int expInYrs;
	
	public Trainer(String fname, String lname, String address, int no_of_skills, int expInYrs)
	{
		super(fname, lname, address);
		this.no_of_skills=no_of_skills;
		this.expInYrs=expInYrs;
	}

	@Override
	public void showDetails() 
	{
		System.out.println(this.getFname());
		System.out.println(this.getLname());
		System.out.println(this.getAddress());
		System.out.println(this.no_of_skills);
		System.out.println(this.expInYrs);
	}
	public void set()
	{
		
	}

}
