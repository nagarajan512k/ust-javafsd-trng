package com.ust4;

public class Exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//code that generates exception
			int divideByZero=5/0;
			System.out.println("Rest of code in try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException=>"+e.getMessage());
		}
	}

}
