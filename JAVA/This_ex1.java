package com.ust2;

public class This_ex1 {

		int a;
		int b;
		
		//Default constructor
		This_ex1()
		{
			this(10,20);
			System.out.println("Inside default constructor");
		}
		
		//Parameterized constructor
		This_ex1(int a,int b)
		{
			this.a=a;
			this.b=b;
			System.out.println("Inside parameterized constructor");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_ex1 object=new This_ex1();
	}

}
