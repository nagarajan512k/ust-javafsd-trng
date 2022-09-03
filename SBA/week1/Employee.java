package com.ust;

public class Employee {
	int empID=235;
	String empName="Raja";
	float salary=60000.00f;
	int age=21;
	String dept="Development";
	void salary() {
		System.out.println("Name: "+empName);
		System.out.println("Salary:"+salary);
			}
	void salary(int a) {
		if(salary>=50000) {
			System.out.println("Mandatory to pay tax");
		}
		else
			System.out.println("Not Mandatory");
			
	}
}
class Engineer extends Employee{
	void salary() {
		
		super.salary();
		
	}
	public static void main(String args[]) {
		Engineer e=new Engineer();
		e.salary();
		e.salary(e.age);
		
	}
}