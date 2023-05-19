package factory.simple_factory2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.simple_factory2.pizza.Pizza;

public class OrderPizza2 {
	String orderType = "";
	Pizza p = null;

	public OrderPizza2() {
		do {
			orderType = getType();
			p = SimpleFactory2.createPizza(orderType);
			if (p != null) {
				p.prepare();
				p.bake();
				p.cut();
				p.box();
			} else {
				System.out.println("ordering failed.");
				break;
			}

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
