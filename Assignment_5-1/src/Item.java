
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

	// Returns a string description item attributes
	public String toString() {
		String description = null;
		double subtotal = 0;
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		description += name + "\t" + quantity;
		description = fmt.format(price) + "\t" + fmt.format(subtotal) + "\t";

		return description;
	}

}