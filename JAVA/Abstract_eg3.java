package com.ust2;

abstract class MotorBike{
	abstract void brake();
}
class SportsBike extends MotorBike{
	//implementation of abstract method
	public void brake() {
		System.out.println("SportsBike Brake");
	}
}
class MountainBike extends MotorBike{
	//implementation of abstract method
	public void brake() {
		System.out.println("MountainBike Brake");
	}
}
public class Abstract_eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike m1=new MountainBike();
		m1.brake();
		SportsBike s1=new SportsBike();
		s1.brake();
	}

}
