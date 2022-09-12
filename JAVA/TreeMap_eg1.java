package com.ust3;

import java.util.TreeMap;

public class TreeMap_eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating TreeMap of evennumbers
		TreeMap<String, Integer> evenNumbers=new TreeMap<>();
		
		//Using put()
		evenNumbers.put("Two",2);
		evenNumbers.put("Four",4);
		
		//Using putIfAbsent()
		evenNumbers.putIfAbsent("Six",6);
		System.out.println("TreeMap of even numbers:"+evenNumbers);
		
		//creating TreeMap of numbers
		TreeMap<String, Integer>  numbers=new TreeMap<>();
		numbers.put("One",1);
		
		//Using putAll()
		numbers.putAll(evenNumbers);
		System.out.println("TreeMap of numbers:"+numbers);
	}

}
