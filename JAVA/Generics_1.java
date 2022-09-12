package com.ust3;

public class Generics_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//intialize generic class
		//with integer data
		GenericsClass<Integer> intObj=new GenericsClass<>(5);
		System.out.println("Generic Class returns:"+intObj.getData());
		
		//intialize generic class
		//with String data
		GenericsClass<String> stringObj=new GenericsClass<>("Java Programming");
		System.out.println("Generic Class returns:"+stringObj.getData());
	}

}

//create a generics class
class GenericsClass<T>{
	
	//variable of T type
	private T data;
	public GenericsClass(T data) {
		this.data=data;
		
	}
	
	//method that return T type variable
	public T getData() {
		return this.data;
	}
}
