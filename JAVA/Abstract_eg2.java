package com.ust2;

abstract class Animal{
	abstract void makeSound();
	
	public void eat() {
		System.out.println("I can eat.");
	}
}

class Dog extends Animal{
	
	//provide implementation of abstract method
	public void makeSound() {
		System.out.println("Bark bark");
	}
}

public class Abstract_eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object of Dog class
		Dog d1=new Dog();
		d1.makeSound();
		d1.eat();
	}

}
