package com.ust2;

abstract class Animal3{
	abstract void makeSound();
	
	public void eat() {
		System.out.println("I can eat.");
	}
}

class Dog3 extends Animal3{
	
	//provide implementation of abstract method
	public void makeSound() {
		System.out.println("Bark bark");
	}
}

public class Abstract_eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an object of Dog3 class
		Dog3 d1=new Dog3();
		d1.makeSound();
		d1.eat();
	}

}
