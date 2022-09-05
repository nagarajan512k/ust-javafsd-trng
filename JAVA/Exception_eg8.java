package com.ust1;

//Java program to demonstrate working of throws
public class Exception_eg8 {
	
	static void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun().");
		throw new IllegalAccessException("demo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	fun();
}
catch(IllegalAccessException e) {
	System.out.println("Caught in main.");
}
	}

}
