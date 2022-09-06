package com.ust2;

class Animal_2
{
	protected String name;
	
	protected void display() {
		System.out.println("I am an animal.");
	}
}

class Dog2 extends Animal_2
{
	public void getInfo() {
		System.out.println("My name is"+name);
	}
}
public class Protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object of the subclass
		Dog2 labrador=new Dog2();
		
		//access protected field and method
		//using the object of subclass
		labrador.name="Rocky";
		labrador.display();
		labrador.getInfo();

	}

}
