package com.day13;

public class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;
	Student(int r,String n,int a)
	{
		this.rollno=r;
		this.name=n;
		this.age=a;
	}
@Override
	public int compareTo(Student st) {
		if(age==st.age)
			return 0;
		else if(age>st.age)
		   return 1;
		return -1;
	}

	
}
