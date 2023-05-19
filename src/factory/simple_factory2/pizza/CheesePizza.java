package factory.simple_factory2.pizza;

public class CheesePizza extends Pizza {
	public void prepare() {
		System.out.println("Preparing " + super.name + " pizza.");
	}
}