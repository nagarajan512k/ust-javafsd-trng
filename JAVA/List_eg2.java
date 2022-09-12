package com.ust3;

import java.util.ArrayList;

public class List_eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> languages=new ArrayList<>();
		
		//add elements in the array list
		languages.add("java");
		languages.add("Kotlin");
		languages.add("C++");
		System.out.println("ArrayList:"+languages);
		
		//change the element of the array list
		languages.set(1, "JavaScript");
		System.out.println("Modified ArrayList:"+languages);
	}

}
