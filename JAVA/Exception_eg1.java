package com.ust1;

public class Exception_eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//code that generate exception
			int divideByZero=5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException=>"+e.getMessage());
		}
	}

}

