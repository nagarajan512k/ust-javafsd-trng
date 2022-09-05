package com.ust1;

class Animal3
{
	//default or no-arg constructor of class Animal
	Animal3(){
		System.out.println("I am an animal");
	}
}

class Dog3 extends Animal3
{
	//default or no-arg constructor of class Dog
	Dog3()
	{
		//calling default constructor of the superclass
		super();
		System.out.println("I am a dog");
		
	}
}
public class Super_eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog3 dog1=new Dog3();
	}

}
