package com.ust;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int expression=9;
		
		switch(expression) {
		case 2:
			System.out.println("Small Size");
			break;
			
		case 3:
			System.out.println("Large size");
			break;
			
			//default case
			default:
				System.out.println("Unknown Size");
		}
	}

}