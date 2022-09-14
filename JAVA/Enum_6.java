package com.ust5;

import java.time.Period;

public class Enum_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Here is the age String in format to parse
		String age="P17Y9M5D";
		
		//converting strings into period value
		//using parse() method
		Period p=Period.parse(age);
		System.out.println("The age is:");
		System.out.println(p.getYears()+"Years\n"
						   +p.getMonths()+"Months\n"
						   +p.getDays()+"Days\n");
	}

}
