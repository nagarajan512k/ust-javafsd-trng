package com.ust1;

//create a final class
final class FinalClass
{
	public void display() {
		System.out.println("This is a final method.");
	}
}
//try to extend the final class
public class Final_eg5 extends FinalClass{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_eg5 obj=new Final_eg5();
		obj.display();
	}

}
