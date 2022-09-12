package com.ust3;


//Java program to show working
//of user-defined Generic classes

//we use<> to specify parameter type

class Testt<T>{
	//An object of type T is declared
	T obj;
	Testt(T obj){this.obj=obj;}//constructor
	public T getObject() {return this.obj;}
}
public class Generics_eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instance of integer type
		Testt<Integer> iObj=new Testt<Integer>(15);
		System.out.println(iObj.getObject());
		
		//instance of String type
		Testt<String> sObj=new Testt<String>("GeeksFroGeeks");
		System.out.println(sObj.getObject());
	//	iObj=sObj;   //This results and error
	}

}