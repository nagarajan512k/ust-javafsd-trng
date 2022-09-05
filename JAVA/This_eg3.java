package com.ust1;

class Test_this
{
	int val_a;
	int val_b;
	
	//Default constructor
	Test_this()
	{
		val_a=10;
		val_b=20;
		
	}
	Test_this get() {
		return this;
	}
	
	void display()
	{
		System.out.println("val_a="+val_a+"val_b="+val_b);
	}
}
public class This_eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_this object=new Test_this();
		object.get().display();
	}

}
