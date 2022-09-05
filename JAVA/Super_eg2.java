package com.ust1;

class Animal1
{
	//overridden method
	public void display()
	{
		System.out.println("I am an animal");
	}
}

class Dog1 extends Animal1
{
	//overridding method @override
	public void display()
	{
		System.out.println("I am a dog");
	}
	public void printMessage() {
		//this calls overriding method
		display();
		
		//this calls overridden method
		super.display();
	}
}

public class Super_eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 dog1=new Dog1();
		dog1.printMessage();
	}

}
