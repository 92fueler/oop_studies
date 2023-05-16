package singleton;

public class Singleton2 {

	public static void main(String[] args) {
		RoadVehicle rv = new RoadVehicle();
		rv.run("motorcycle");
		rv.run("car");

		AirVehicle av = new AirVehicle();
		av.run("plane");
	}
}

class RoadVehicle {
	public void run(String v) {
		System.out.println(v + " is running on the freeway.");
	}
}

class AirVehicle {
	public void run(String v) {
		System.out.println(v + " is flying in the air.");
	}
}
