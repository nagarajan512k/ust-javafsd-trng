package com.ust;


class A
{
	
}
class B extends A
{
	
}
public class InstanceofDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B objOfClassB=new B();
		
		System.out.println("objOfClassB is an instance of B:"+(objOfClassB instanceof B));
		System.out.println("ObjOfClassB is an instance of the parent class A:"+(objOfClassB instanceof A));
	}

}
