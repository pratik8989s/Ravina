package Demo;

import java.util.Scanner;

public class Doctor 
{	
	String degree;
	String name;
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) throws DoctorException
	{
		if(degree.isEmpty())
			throw new DoctorException();
		else
		this.degree = degree;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Doctor [degree=" + degree + ", name=" + name + "]";
	}
	
}
