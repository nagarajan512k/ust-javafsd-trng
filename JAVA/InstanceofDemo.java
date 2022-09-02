package com.ust;

class Fruit
{

}
class Vehicle
{
	
}
public class InstanceofDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit pineapple=new Fruit();
		Vehicle truck=new Vehicle();
		
		System.out.println("pineapple is a fruit:"+(pineapple instanceof Fruit));
		System.out.println("truck is a vehicle:"+(truck instanceof Vehicle));
		
	}

}
