package com.ust1;

public class String_eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="C++ Programming";
		
		//all occurances of "C++" is replaced with "Java"
		System.out.println(str1.replace("C++","Java"));  //Java Programming"
		
		//all occurances of "aa" is replaced with"zz"
		System.out.println("aa bb aa zz".replace("aa","zz"));   //zz bb zz zz
		
		//substring not the string
		System.out.println("Java".replace("C++","C"));  //Java
			
	}

}
