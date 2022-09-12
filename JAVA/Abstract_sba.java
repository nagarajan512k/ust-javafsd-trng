package com.ust2;

abstract class Employee
{
	abstract void calculateSalary();
	public void fetchDepartment()
	{
		System.out.println("Fetch Department");
	}
	
}

class Engineeer extends Employee
{
	public void calculateSalary() {
		System.out.println("Salary calculation");
	}
}


class Doctorr extends Employee
{
	public void calculateSalary() {
		System.out.println("jhgjhg");
	}
}

public class Abstract_sba {

	public static void main(String args[]) {
		Doctorr d1=new Doctorr();
		d1.calculateSalary();
		Engineeer e1=new Engineeer();
		e1.calculateSalary();
		e1.fetchDepartment();
	}
}
