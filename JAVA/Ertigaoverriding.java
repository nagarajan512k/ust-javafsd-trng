package com.ust;

class Car{
	String model;
	String color;
	int wheels;
	int seats;
	String geartype;
	
	void display() {
		
		
		System.out.println("In car class");
	}
}

class Ciaz extends Car{
	void display() {
		System.out.println("In ciaz class");
		}
	
	void show() {
		System.out.println("In show method");
		
	}
	


}

public class Ertigaoverriding extends Car {
	void display() {
		System.out.println("In Ertiga class");
		super.display();
	}
	
	public static void main(String args[]) {
		Ciaz c=new Ciaz();
		
		c.display();
		c.show();
		Ertigaoverriding e=new Ertigaoverriding();
		e.display();System.out.println(e.color);
	}
	
	
	
}
