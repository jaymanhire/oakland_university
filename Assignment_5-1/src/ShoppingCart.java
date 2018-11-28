import java.text.NumberFormat;

public class ShoppingCart {

	private Item[] cart;
	private int itemCount = 0;
	private double totalPrice = 0;
	private int capacity = 5;
	// private String name;
	private String name;

	// -----------------------------------------------------------------
	// Constructor: Creates an initially empty cart.
	// -----------------------------------------------------------------
	public ShoppingCart() {
		cart = new Item[capacity];
		itemCount = 0;
		totalPrice = 0.0;

	}

	// -----------------------------------------------------------------
	// Adds a Item to the cart, increasing the size of the array if necessary.
	// -----------------------------------------------------------------
	public void addToCart(String name, double price, int quantity) {
		if (itemCount == cart.length)
			increaseSize();
		cart[itemCount] = new Item(name, price, quantity);
		totalPrice += price;
		itemCount++;
	}

	// -----------------------------------------------------------------
	// Returns a report describing the Cart items.
	// -----------------------------------------------------------------

	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "Shopping Cart:\n\n";
		report += "Item: " + name + "\t";
		report += "Number of items: " + itemCount + "\n";
		report += "Total cost: " + fmt.format(totalPrice) + "\n";
		report += "Subtotal: " + fmt.format(totalPrice * itemCount);
		report += "\n\nItem List:\n\n";
		for (int item = 0; item < itemCount; item++)
			report += cart[item].toString() + "\n";
		return report;
	}

	// Increases the capacity of the collection by creating a
	// larger array and copying the existing collection into it.
	private void increaseSize() {
		Item[] temp = new Item[cart.length + 3];
		for (int item = 0; item < cart.length; item++)
			temp[item] = cart[item];
		cart = temp;
	}
}
