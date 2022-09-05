package com.ust1;

public class Exception_eg7 
{

	//Java program that demonstrate the use of throw
	
		static void fun()
		{
			try
			{
				throw new NullPointerException("demo");
			}
			catch(NullPointerException e)
			{
				System.out.println("Caught inside fun().");
				throw e;  //rethrowing the exception
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	fun();
}
catch(NullPointerException e) {
	System.out.println("Caught in  main.");
}
	}

}