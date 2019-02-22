package com.day13;

import java.util.HashMap;
import java.util.Map;

public class TestCollection13 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(111,"Abhi");
		hm.put(222, "Annu");
		hm.put(333,"Meghna");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
