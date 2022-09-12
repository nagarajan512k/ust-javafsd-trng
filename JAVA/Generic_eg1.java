package com.ust3;


//Java program to show multiple
//type parameters in java Generics

//we use<> to specify parameter type
class Test<T,U>
{
	T obj1;   //An object of Type T
	U obj2;   //An object of Type U
	
	//constructor
	Test(T obj1,U obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
		
	}
	
	//To print objects of T and U
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

//Driver class to test above
public class Generic_eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test<String,Integer> obj=new Test<String, Integer>("GfG",15);
		obj.print();
	}

}
