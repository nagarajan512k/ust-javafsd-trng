package com.ust3;

class GenericsClass2<T extends String>
{
	public void display() {
		System.out.println("This is a bounded type generic class.");
	}
}
class Generics_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object of GenericsClass
		GenericsClass2<String> obj=new GenericsClass2<String>();
		obj.display();

	}

}
