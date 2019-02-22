package com.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class ComparatorDemo {
  public static void main(String [] args)
  {
	  Date d1=new Date();
	  System.out.println(d1.toString( ));
	  
	  ArrayList<Student1> ar= new ArrayList<Student1>();
	  ar.add(new Student1(111,"bbb","london"));
	  ar.add(new Student1(131,"aaa","nyc"));
	  ar.add(new Student1(121,"ccc","jaipur"));
	  System.out.println("unsorted");
	  for(int i=0 ;i<ar.size();i++)
	  {
		  System.out.println(ar.get(i));
	  }
	  Collections.sort(ar,new Sortbyroll() );
	  System.out.println("sorted by rollno:");
	  for(int i=0 ;i<ar.size();i++)
	  {  System.out.println(ar.get(i));
	  }	  Collections.sort(ar,new Sortbyname() );
	  System.out.println(" sorted by name");
	  for(int i=0;i<ar.size();i++)
	  {  System.out.println(ar.get(i));
	  
	  }
	  Collections.sort(ar,new Sortbyaddress());
	  System.out.println("sort by address");
	  for(int i=0;i<ar.size();i++)
		  System.out.println(ar.get(i));
  }
}
