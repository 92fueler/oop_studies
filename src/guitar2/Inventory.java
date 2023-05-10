package guitar2;

import java.util.*;

import guitar2.types.*;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);

		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public LinkedList<Guitar> search(Guitar searchGuitar) {
		LinkedList<Guitar> matchingGuitars = new LinkedList<Guitar>();

		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();

			String builder = searchGuitar.getBuilder();
			if ((builder != null) && !builder.equals("") && !builder.equals(guitar.getBuilder()))
				continue;

			String model = searchGuitar.getModel();
			if ((model != null) && !model.equals("") && !model.equals(guitar.getModel()))
				continue;

			String type = searchGuitar.getType();
			if ((type != null) && !type.equals("") && !type.equals(guitar.getType()))
				continue;

			String backWood = searchGuitar.getBackWood();
			if ((backWood != null) && !backWood.equals("") && !backWood.equals(guitar.getBackWood()))
				continue;

			String topWood = searchGuitar.getTopWood();
			if ((topWood != null) && !topWood.equals("") && !topWood.equals(guitar.getTopWood()))
				continue;

			matchingGuitars.add(guitar);
		}

		return matchingGuitars;
	}
}
