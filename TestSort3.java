package com.day13;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort3 {

	public static void main(String[] args) {
		ArrayList<Student> a=new ArrayList<Student>();
		a.add(new Student(111,"abhi",23));
		a.add(new Student(222,"annu",21));
		a.add(new Student(555,"vivek",25));
		Collections.sort(a,Collections.reverseOrder());
		for(Student st:a)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}

}
