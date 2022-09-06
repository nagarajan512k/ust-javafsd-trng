package com.ust2;

//create an interface
interface Language1{
	void getName(String name);
}

//class implements interface
class ProgrammingLanguage implements Language1{
	
	//implementation of abstract method
	public void getName(String name) {
		System.out.println("Programming Language:"+name);
	}
}
public class Interface_eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammingLanguage language=new ProgrammingLanguage();
		language.getName("Java");

	}

}
