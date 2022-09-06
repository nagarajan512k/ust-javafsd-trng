package com.ust2;

public class Pattern {
	
	//method without parameter
	public void display() {
		for(int i=0;i<2;i++) {
			System.out.println("*");
		}
	}
	
	//method with single parameter
	public void display(char symbol) {
		for(int i=0;i<10;i++) {
			System.out.println("symbol");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern d1=new Pattern();
		
		//call method without any argument
		d1.display();
		System.out.println("\n");
	
	//call method with single argument
		d1.display('#');
	}

}
