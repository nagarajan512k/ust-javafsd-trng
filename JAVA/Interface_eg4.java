package com.ust2;

interface Polygon1{
	void getArea();
	
	//default method
	default void getSides() {
		System.out.println("I can get sides of a polygon");
	}
}


//implements the interface
class Rectangle1 implements Polygon1{
	public void getArea() {
		int length=6;
		int breadth=5;
		int area=length*breadth;
		System.out.println("The area of the rectangle is "+area);
	}
	//override the getSides()
	public void getsides() {
		System.out.println("I have 4 sides.");
	}
}

//implements the interface
class sqr1 implements Polygon1{
	public void getArea() {
		int length=5;
		int area=length*length;
		System.out.println("The area of the square is"+area);
	}
}
public class Interface_eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object of Rectangle
		Rectangle1 r1=new Rectangle1();
		r1.getArea();
		r1.getsides();
		
		//create an object of square
		sqr1 s1=new sqr1();
		s1.getArea();
		s1.getSides();

	}

}
