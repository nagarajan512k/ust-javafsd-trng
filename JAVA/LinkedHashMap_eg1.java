package com.ust3;

import java.util.LinkedHashMap;

public class LinkedHashMap_eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating a LinkedHashMap of even numbers
		LinkedHashMap<String,Integer> evenNumbers=new LinkedHashMap<>();
		evenNumbers.put("Two",2);
		evenNumbers.put("Four",4);
		System.out.println("LinkedHashMap1:"+evenNumbers);
		
		//creating a LinkedHashMap from other LinkedHashMap
		LinkedHashMap<String, Integer> numbers=new LinkedHashMap<>(evenNumbers);
		numbers.put("Three",3);
		System.out.println("LinkedHashMap2:"+numbers);
	}

}
