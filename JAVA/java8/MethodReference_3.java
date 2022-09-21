package methodReference;


interface Sayable{
	void say();
	
}
public class MethodReference_3 {
	
	public static void saySomething() {
		System.out.println("Hello, this is staic method.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sayable sayable=MethodReference_3::saySomething;
		
		sayable.say();

	}

}
