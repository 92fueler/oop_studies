package singleton;

public class Singleton1 {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.run("motorcycle");
	}

}

class Vehicle {
	public void run(String v) {
		System.out.println(v + " is running on the freeway");
	}
}