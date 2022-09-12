package sba2;

abstract class Employee{
	
	abstract void calculateSalary(float s);
	abstract void fetchDepartment(String d);
}

class Engineer extends Employee{
	public void calculateSalary(float s) {
		int increment=2000;
		float total=s+increment;
		System.out.println("Your salary is:"+total);
	}
	public void fetchDepartment(String d) {
		System.out.println("Your Department is:"+d);
	}
}
class Doctor extends Employee{
	public void calculateSalary(float s1) {
		int increment=2000;
		float total=s1+increment;
		System.out.println("Your slary is :"+total);
	}
	public void fetchDepartment(String d) {
		System.out.println("Your department is :"+d);
	}
}
public class Sba2_1 {

	public static void main(String[] args) {
		
		Engineer eng=new Engineer();
		eng.calculateSalary(30000);
		eng.fetchDepartment("MCA");
		
		Doctor doc=new Doctor();
		doc.calculateSalary(25000);
		doc.fetchDepartment("MBA");
		// TODO Auto-generated method stub

	}

}
