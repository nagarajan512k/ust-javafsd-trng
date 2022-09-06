package com.ust2;



class Animal_1{
	
	//method in the superclass
	public void eat() {
		System.out.println("I can eat");
	}
}

//Dog inherits Animal
class Dog_1 extends Animal_1{
	//overridding the eat() method
	//@override
	public void eat() {
		
		//call method of super class
		super.eat();
		System.out.println("I eat dog food");
	}
	//new method in subclass
	public void bark() {
		System.out.println("I can bark");
	}
}
public class Super_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object of the subclass
		Dog_1 labrador=new Dog_1();
		
		//call the eat() method
		labrador.eat();
		labrador.bark();
	}

}
