package defaultstatic;

interface Sayable1
{
	default void say() {
		System.out.println("Hello, this is default method");
	}
	//Abstract method
	void sayMore(String msg);
}
public class Default_2 implements Sayable1{
	
	public void sayMore(String msg)    //implementing abstract method
	{
		System.out.println(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Default_2 dm=new Default_2();
		dm.say();
		dm.sayMore("work is workship");    //calling abstract method
	}

}
