package com.ust2;

interface Employeee
{
	void calculateSalary();
}
interface Engineer extends Employeee
{
	void fetchDepartment();
}
class Doctor implements Engineer
{
	public void calculateSalary()
	{
		System.out.println("Salary Calculation");
	}
	public void fetchDepartment()
	{
		System.out.println("Fetch Department");
	}
}
public class Interface_sba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d1=new Doctor();
		d1.calculateSalary();
		d1.fetchDepartment();
	}

}
