package lambda;

public class Lambda_1 {
	
	//this is functional interface
	@FunctionalInterface
	interface MyInterface{
		
		//abstract method
		double getPiValue();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare a reference to MyInterface
		MyInterface ref;
		
		//lambda expression
		ref=()-> 3.1415;
		
		System.out.println("Value of Pi="+ref.getPiValue());

	}

}
