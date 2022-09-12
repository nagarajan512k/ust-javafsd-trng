package com.ust3;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> numbers=new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("TreeSet:"+numbers);
		
		//calling iterator() method
		Iterator<Integer> iterate=numbers.iterator();
		System.out.println("TreeSet using iterator:");
		
		//Accessing elements
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
			System.out.println(",");
		}
	}

}
