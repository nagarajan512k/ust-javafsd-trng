package methodReference;

public class MethodReference_4 {
	
	public void printMsg() {
		System.out.println("Hello, this is instance method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t2=new Thread(new MethodReference_4()::printMsg);
		t2.start();
		

	}

}

