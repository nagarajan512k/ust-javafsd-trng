package com.ust;

public class Switch_example {
	public static void main (String args[]){
		String str="Green1";
		switch(str) {
		case "Red":
			System.out.println("I am in red");
			System.out.println("*");
		default:
			System.out.println("default");
			break;
		case "Green":
			System.out.println("I am in green");
			System.out.println("*");
			break;
		case "Yellow":
			System.out.println("I am in yellow");
			System.out.println("*");
			break;
		
			
			
		}
	}

}
