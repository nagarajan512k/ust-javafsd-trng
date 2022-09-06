package com.ust2;


interface A{
	void funcA();
}
interface B extends A
{
	void funcB();
	
}
class C implements B{
	public void funcA() {
		System.out.println("This is funcA");
	}
	public void funcB() {
		System.out.println("This is funcB");
	}
}
public class Interface_eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		obj.funcA();
		obj.funcB();

	}

}
