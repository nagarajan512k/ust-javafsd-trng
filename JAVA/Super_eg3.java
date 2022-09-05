package com.ust1;


class Animal2
{
	protected String type="animal";
}

class Dog2 extends Animal2{
	public String type="mammal";
	public void printType()
	{
		System.out.println("I am a"+type);
		System.out.println("I am an"+super.type);
	}
}
public class Super_eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 dog1=new Dog2();
		dog1.printType();
	}

}
