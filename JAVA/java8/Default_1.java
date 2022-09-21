package defaultstatic;

interface TestInterface
{
	//abstract method
	public void square(int a);
	
	//default method
	default void show()
	{
		System.out.println("Default Method Executed");
	}
}
public class Default_1 implements TestInterface {

	//implementation of square abstract method
	public void square(int a)
	{
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Default_1 d=new Default_1();
		d.square(4);
		
		//default method executed
		d.show();
	}

}
