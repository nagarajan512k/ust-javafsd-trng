package com.ust1;


class Test_this1
{
	void print()
	{
		//calling functionshow()
		this.show();
		System.out.println("Test_this::print");
	}
	void show()
	{
		System.out.println("Test_this::show");
	}
}
public class This_eg4 {

	public static void main(String[] args) {
		Test_this1 t1=new Test_this1();
		t1.print();
	}

}