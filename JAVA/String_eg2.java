package com.ust1;

public class String_eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="program";
		
		//from 1st to the 7th character
		System.out.println(str1.substring(0,7));  //program
		
		//from 1st to the 5th character
		System.out.println(str1.substring(0,5));  //progr
		
		//from 4th to the 5th character
		System.out.println(str1.substring(3,5));  //gr
	}

}
