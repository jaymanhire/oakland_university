
// Represents a shopping cart

import java.text.NumberFormat;

public class Item {
	private String name;
	private double price;
	private int quantity = 0;

	// Creates a new Item with the specified information
	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public int getQuantity() {
		return this.quantity;

	}

	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		double total = price * quantity;
		String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "Item: ";
		report += name + "\t";
		report += "Price: " + fmt.format(price) + "\t";
		report += "Number of items: " + quantity + "\n";
		report += "Total: " + fmt.format(total) + "\n";

		// for (int item = 0; item < itemCount; item++)
		// report += cart[item].toString() + "\n";
		return report;
	}

}