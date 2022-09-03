package com.ust;

public class Employee {
	int empID=235;
	String empName="Raja";
	float salary=60000.00f;
	int age=21;
	String dept="Development";
	void salary() {
		System.out.println("Salary:"+salary);
		
	}
	void salary(int a) {
		if(age>50) {
			System.out.println("Eligible for bonus");
		}
		else
			System.out.println("Not Eligible");
			
	}
}
class Engineer extends Employee{
	void salary() {
		System.out.println("Name: "+empName);
	}
	public static void main(String args[]) {
		Engineer e=new Engineer();
		e.salary();
		e.salary(e.age);
		Employee emp=new Employee();
		emp.salary();
	}
}