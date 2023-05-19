package factory.simple_factory2.pizza;

public abstract class Pizza {
	protected String name;

	// make it as an abstract method
	// because different pizzas need different preparation
	public abstract void prepare();

	public void bake() {
		System.out.println(name + "- This is bake step");
	}

	public void cut() {
		System.out.println(this.name + "- This is cut step");
	}

	public void box() {
		System.out.println(this.name + "- This is box step");
	}

	public void setName(String name) {
		this.name = name;
	}

}