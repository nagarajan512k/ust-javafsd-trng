package com.ust4;

public class Exception_7 {
	static void fun()
	{
		try {
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e) {
			System.out.println("Caught inside fun().");
			throw e;   ///rethrowing the exception
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			fun();
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught in main.");
		}

		
	}

}
