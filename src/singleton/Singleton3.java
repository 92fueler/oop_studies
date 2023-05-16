package singleton;

public class Singleton3 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.runRoad("motorcycle");
		v.runRoad("car");

		v.runAir("plane");

		v.runWater("ship");
	}
}

class Vehicle {
	public void runRoad(String v) {
		System.out.println(v + " is running on the freeway.");
	}

	public void runAir(String v) {
		System.out.println(v + " is fling in the air.");
	}

	public void runWater(String v) {
		System.out.println(v + " is swimming in the water.");
	}
}
