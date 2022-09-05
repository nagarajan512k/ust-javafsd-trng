package com.ust1;

class Animal
{
	//overridden method
	public void display() {
		System.out.println("I am an animal");
	}
}

class Dog extends Animal{
	
	//overridding method
	//@override
	public void display()
	{
		System.out.println("I am a dog");
	}
	
	public void printMessage()
	{
		display();
	}
}

public class Super_eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog();
		dog1.printMessage();
	}

}
