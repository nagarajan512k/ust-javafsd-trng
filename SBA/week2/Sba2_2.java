package sba2;

interface Employ{
	
	 void calculateSalary(float s);
	 void fetchDepartment(String d);
}

class Engineeer implements Employ{
	public void calculateSalary(float s) {
		int increment=2000;
		float total=s+increment;
		System.out.println("Your salary is:"+total);
	}
	public void fetchDepartment(String d) {
		System.out.println("Your Department is:"+d);
	}
}
class Doctoor implements Employ{
	public void calculateSalary(float s1) {
		int increment=2000;
		float total=s1+increment;
		System.out.println("Your slary is :"+total);
	}
	public void fetchDepartment(String d) {
		System.out.println("Your department is :"+d);
	}
}
public class Sba2_2 {

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
