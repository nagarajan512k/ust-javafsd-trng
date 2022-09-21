package lambda;

@FunctionalInterface  //it is optional
interface Drawable{
	public void draw();
	
}

public class Lambda_2 {
	public static void main(String[] args) {
	
		int width=10;
		
		//with lambda
		Drawable d2=()->{
			System.out.println("Drawing"+width);
		};
		d2.draw();
	}

}
