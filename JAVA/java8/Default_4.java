package defaultstatic;

public class Default_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle=new Car();
		vehicle.print();
	}

}
interface Vehicle{
	default void print() {
		System.out.println("Iam a vehicle!");
	}
	static void blowHorn() {
		System.out.println("Blowing Horn!!!");
	}
}

interface FourWheeler{
	default void print() {
		System.out.println("Iam a four wheeler!");
	}
}
class Car implements Vehicle, FourWheeler{
	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("I am a car!");
	}
}
