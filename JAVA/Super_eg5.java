package com.ust1;

class Animal4
{
	//default or no-arg constructor
	Animal4()
	{
		System.out.println("I am an animal");
	}
	//parameterized constructor
	Animal4(String type)
	{
		System.out.println("Type:"+type);
	}
}

class Dog4 extends Animal4
{
	//default constructor
	Dog4()
	{
		//calling parametrized constructor of the superclass
		super("Animal");
		System.out.println("I am a dog");
	}
}
public class Super_eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog4 dog1=new Dog4();
	}

}
