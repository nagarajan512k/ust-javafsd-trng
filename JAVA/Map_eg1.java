package com.ust3;

import java.util.HashMap;
import java.util.Map;

public class Map_eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating a map using the HashMap
		Map<String, Integer>numbers=new HashMap<>();
		
		//Insert elements to the map
		numbers.put("one",1);
		numbers.put("Two",2);
		System.out.println("Map:"+numbers);
		
		//Acess keys to the map
		System.out.println("keys:"+numbers.keySet());
		
		//Access values of the map
		System.out.println("Values:"+numbers.values());
		
		//Access entries of the map
		System.out.println("Entries:"+numbers.entrySet());
		
		//Remove Elements from the map
		int value=numbers.remove("Two");
		System.out.println("Removed Value:"+value);
	}

}
