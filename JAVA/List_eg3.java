package com.ust3;

import java.util.ArrayList;
import java.util.Iterator;

public class List_eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating an ArrayList
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		System.out.println("ArrayList:"+numbers);
		
		//creating an instance of iterator
		Iterator<Integer> iterate=numbers.iterator();
		
		//Using the next() method
		int number=iterate.next();
		System.out.println("Accessed Element:"+number);
		
		//Using the remove() method
		iterate.remove();
		System.out.println("Removed Element:"+number);
		
		System.out.println("Updated ArrayList:");
		
		//Using the hasNext() method
		while(iterate.hasNext()) {
			//Using the forEachRemaining() method
			iterate.forEachRemaining((value) -> System.out.println(value+","));
			
		}
	}

}
