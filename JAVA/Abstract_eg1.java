package com.ust2;

abstract class Language
{
	//method of abstract class
	public void display() {
		System.out.println("This is Java Programming");
	}
}
public class Abstract_eg1 extends Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object of Main
		Abstract_eg1 obj=new Abstract_eg1();
		
		//access method of abstract class
		//using object of Main class
		obj.display();
	}

}
