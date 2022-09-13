package com.ust4;

public class Exception_8 {
	static void fun()throws IllegalAccessException
	{
		System.out.println("inside fun().");
		throw new IllegalAccessException("demo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			fun();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Caught in main.");
		}
		
	}

}
