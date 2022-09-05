package com.ust1;

class FinalDemo
{
	//create a final method
	public final void display()
	{
		System.out.println("This is a final mthod.");
	}
}


public class Final_eg4 extends FinalDemo {
	//try to override final method
	public final void display() {
		System.out.println("This final method is overridden.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_eg4 obj=new Final_eg4();
		obj.display();
		

	}
	

}
