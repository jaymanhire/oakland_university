
// Represents a shopping cart

import java.text.NumberFormat;

public class Item {
	private String name;
	private double price = 0;
	private int quantity = 0;

	// Creates a new Item with the specified information
	public Item(String name, double price, int quantity) {
		this.name = name;
		if (quantity > 0) {
			this.quantity = quantity;
		} else {
			this.quantity = 0;
		}
		if (price > 0) {
			this.price = price;
		} else {
			this.price = 0;
		}
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
		String report = name + "\t" + fmt.format(price) + "\t\t" + quantity + "\t\t" + fmt.format(quantity * price);
		return report;
	}

}