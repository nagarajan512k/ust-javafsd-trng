package com.ust3;

import java.util.Map;
import java.util.TreeMap;

public class Map_eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating Map using TreeMap
		Map<String, Integer> values=new TreeMap<>();
		
		//insert element to map
		values.put("Second",2);
		values.put("First",1);
		System.out.println("Map using TreeMap:"+values);
		
		//Replacing the values
		values.replace("First",11);
		values.replace("Second",22);
		System.out.println("New Map:"+values);
		
		//Remove elements from the map
		int removedValue=values.remove("First");
		System.out.println("Removed value:"+removedValue);
	}

}
