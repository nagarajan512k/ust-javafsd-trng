package defaultstatic;


interface Sayable
{
	default void say() {
		System.out.println("Hello, this is default method");
	}
	//Abstract method
	void sayMore(String msg);
	
	//static method
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}
public class Default_3 implements Sayable {
	public void sayMore(String msg) {     //implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Default_3 dm=new Default_3();
		dm.say();    //calling default method
		dm.sayMore("work is workship");   //calling abstract method
		Sayable.sayLouder("Helloooo...");    //calling static method

	}

}
