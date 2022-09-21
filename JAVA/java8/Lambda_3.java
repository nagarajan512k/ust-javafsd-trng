package lambda;


interface Addable{
	int add(int a,int b);
}
public class Lambda_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Multiple parameters in lambda expression
		Addable ad1=(a,b)->(a+b);
		System.out.println(ad1.add(100,200));

	}

}
