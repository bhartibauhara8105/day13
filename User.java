package com.day13;

public class User implements Comparable {
	String first;
	String last;
	int id;
	

	public User(String string, String string2, int i) {
		first=string;
		last=string2;
		id=i;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString()
	{
		return first+" "+last+" "+id;
	}

}
