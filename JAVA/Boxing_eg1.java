package com.ust2;
//Java program to illustrate the concept
//of Autoboxing and Unboxing

//Importing required classes
import java.io.*;
//Main class
public class Boxing_eg1 {
	//Main driver method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an integer object
		//with custom value say it be 10
		Integer i=new Integer(10);
		
		//Unboxing the Object
		int i1=i;
		
		//print statements
		System.out.println("Value of i:"+i);
		System.out.println("Value of i1:"+i1);
		
		//Autoboxing of character
		Character x='a';
		
		//Auto-unboxing of Character
		char ch=x;
		
		//Print statements
		System.out.println("value of ch:"+ch);
		System.out.println("Value of x:"+x);
	}

}
