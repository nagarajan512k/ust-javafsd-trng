package com.ust5;

enum Sizee
{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
}
class Test{
	Sizee pizzaSize;
	public Test(Sizee pizzaSize) {
		this.pizzaSize=pizzaSize;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small size pizza");
			break;
		case MEDIUM:
			System.out.println("I ordered medium size pizza");
			break;
			default:
			System.out.println("I don't know which one to order");
			break;
		}
	}
}
public class Enum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1=new Test(Sizee.MEDIUM);
		t1.orderPizza();
	}

}
