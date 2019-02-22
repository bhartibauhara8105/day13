package com.day13;

public class Student1 {
	int rollno;
	String name,address;
	
	public Student1(int r,String n,String a)
	{
		this.rollno=r;
		this.name=n;
		this.address=a;
		
	}
	
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

}
