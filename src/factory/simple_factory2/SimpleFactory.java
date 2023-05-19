package factory.simple_factory2;

import factory.simple_factory2.pizza.*;

public class SimpleFactory {
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;

		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("greek");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("cheese");
		}

		return pizza;

	}

}
