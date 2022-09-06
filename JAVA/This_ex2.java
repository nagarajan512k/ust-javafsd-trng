package com.ust2;

public class This_ex2 {

	int a;
	int b;
	
	//Default constructor
	This_ex2()
	{
		a=10;
		b=20;
		
	}
	
	//Method that returns current class instance
	This_ex2 get()
	{
		return this;
	}
	
	//Displaying value of variables a and b
	void display()
	{
		System.out.println("a="+a+"b="+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		This_ex2 object=new This_ex2();
		object.get().display();
	}

}
