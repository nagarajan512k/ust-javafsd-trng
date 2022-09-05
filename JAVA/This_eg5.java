package com.ust1;

class This_construct
{
	int val1;
	int val2;
	
	//Default constructor
	This_construct()
	{
		this(10,20);
		System.out.println("Default constructor \n");
	}
	
	//parameterized constructor
	This_construct(int val1, int val2)
	{
		this.val1=val1;
		this.val2=val2;
		System.out.println("Parameterized constructor");
	}
}

public class This_eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_construct object=new This_construct();
	}

}
