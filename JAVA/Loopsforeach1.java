package com.ust;

public class Loopsforeach1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//an array of numbers
		int[] numbers= {3,4,5,-5,0,12};
		int sum=0;
		
		//iterating through each element of the array
		for(int number: numbers) {
			sum+=number;
			
		}
System.out.println("Sum="+sum);
	}

}
