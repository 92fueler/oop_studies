package guitar1;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Guitar whatErinLikesGuitar = new Guitar("", 0, "Fender", "Stratocaster", "electric", "alder", "maple");

		Guitar guitar = inventory.search(whatErinLikesGuitar);
		if (guitar != null) {
			System.out.println("Erin, you might like: " +
					guitar.getBuilder() + " " + guitar.getModel() + " "
					+ guitar.getType() + " guitar: \n");
		} else {
			System.out.println("Sorry Erin, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("123", 999.99, "Gibson", "Les Paul", "electric", "mahogany", "maple");
		inventory.addGuitar("456", 1299.99, "Fender", "Stratocaster", "electric", "alder", "maple");
		inventory.addGuitar("789", 1499.99, "Martin", "D-28", "acoustic", "rosewood", "spruce");
		inventory.addGuitar("111", 1599.99, "Gibson", "SG", "electric", "mahogany", "rosewood");
		inventory.addGuitar("222", 1999.99, "Paul Reed Smith", "Custom 24", "electric", "mahogany", "maple");
		inventory.addGuitar("333", 2999.99, "Taylor", "914ce", "acoustic", "rosewood", "spruce");
		inventory.addGuitar("444", 499.99, "Yamaha", "FG800", "acoustic", "nato", "spruce");
		inventory.addGuitar("555", 799.99, "Epiphone", "Hummingbird Pro", "acoustic", "mahogany", "spruce");
	}
}
