package guitar2;

import java.util.*;

import guitar2.types.*;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Guitar whatErinLikesGuitar = new Guitar("", 0, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.UNKNOWN,
				Wood.MAPLE);

		List<Guitar> guitars = inventory.search(whatErinLikesGuitar);

		if (!guitars.isEmpty()) {
			for (Guitar guitar : guitars) {
				System.out.println("Erin, you might like: \n" +
						guitar.getBuilder() + " " + guitar.getModel() + " "
						+ guitar.getType() + " guitar \n");
			}

		} else {
			System.out.println("Sorry Erin, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("123", 999.99, Builder.GIBSON, "Les Paul", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE);
		inventory.addGuitar("456", 1299.99, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.MAPLE);
		inventory.addGuitar("789", 1499.99, Builder.MARTIN, "D-28", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA);
		inventory.addGuitar("1617", 1499.99, Builder.COLLINGS, "D2H", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA);
		inventory.addGuitar("1819", 3299.99, Builder.OLSON, "SJ", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK);
		inventory.addGuitar("2021", 2199.99, Builder.FENDER, "McCarty 594", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE);
	}
}
