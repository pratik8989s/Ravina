package day6Assignments;

public class Abc {

	
	private int custno;
	private String custName;
	
	public Abc(int custno, String custName) {
		super();
		this.custno = custno;
		this.custName = custName;
	}

	public int getCustno() {
		return custno;
	}

	public void setCustno(int custno) {
		this.custno = custno;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
	
	@Override
	public String toString() {
		return "Abc [custno=" + custno + ", custName=" + custName + "]";
	}

	public static void main(String[] args) {
		
		Abc a=new Abc(10, "Vishal");
		System.out.println(a);
		a.setCustno(15);
		//a.setCustName("Akash");
		System.out.println(a);
		
	}
	
	
	
}
