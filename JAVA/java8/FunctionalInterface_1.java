package functionalInterface;

@FunctionalInterface
interface sayable{
	void say(String msg);
	
	int hashCode();
	String toString();
	boolean equals(Object obj);
	
}

public class FunctionalInterface_1 implements sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionalInterface_1 fie=new FunctionalInterface_1();
		fie.say("Hello there");
		
	}

}
