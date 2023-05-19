package factory.simple_factory1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
	Pizza pizza = null;
	String orderType;

	public OrderPizza() {
		do {
			orderType = getType();
			if (orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName("greek");
			} else if (orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName("cheese");
			} else {
				break;
			}
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while (true);
	}

	private String getType() {
		try {
			BufferedReader inputStr = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Input pizza type: ");
			return inputStr.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}

abstract class Pizza {
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

class CheesePizza extends Pizza {
	public void prepare() {
		System.out.println("Preparing " + super.name + " pizza.");
	}
}

class GreekPizza extends Pizza {
	public void prepare() {
		System.out.println("Preparing greek pizza.");
	}
}