package com.ust5;

public class MethodLocal {
	void display() {
		int x=5;
		
		class MethodInner{
			void display1() {
				System.out.println("In Method Local");
			}
			
		}
		MethodInner i=new MethodInner();
		i.display1();
	}    //method ends
	public static void main(String[] args) {
		MethodLocal m=new MethodLocal();
		m.display();
		System.out.println("Calling outer class");
	}
}
