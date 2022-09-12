package com.ust3;

class GenericsType4<T>{
	T obj;
	public T get() {
		return this.obj;
		
	}
	public void set(T obj) {
		this.obj=obj;
	}
}

public class Generics_ex2 {
	
	//Java Generic Method
	public static<T>boolean isEqual(GenericsType4<T> g1,GenericsType4<T> g2){
		return g1.get().equals(g2.get());
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericsType4<String> g1=new GenericsType4<>();
		g1.set("Pankaj");
		
		
		GenericsType4<String>g2=new GenericsType4<>();
				g2.set("Pankaj");
		
		boolean isEqual= Generics_ex2.<String>isEqual(g1,g2);
		
		//above statements can be written simply as
		System.out.println(isEqual);

	}

}
