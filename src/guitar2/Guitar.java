package guitar2;

import guitar2.types.*;

public class Guitar {
	private String serialNumber, model;
	Builder builder;
	Type type;
	Wood backWood, topWood;
	private double price;

	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public String getBuilder() {
		return builder.toString();
	}

	public String getModel() {
		return model;
	}

	public String getType() {
		return type.toString();
	}

	public String getBackWood() {
		return backWood.toString();
	}

	public String getTopWood() {
		return topWood.toString();
	}

	public static void main(String[] args) {
		System.out.println("hello world");
	}
}