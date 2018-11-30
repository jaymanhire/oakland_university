import java.text.NumberFormat;

public class ShoppingCart {

	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	private Item[] cart;
	private int itemCount = 0;
	private double totalPrice = 0;
	private int capacity = 5;
	private int totalItems;
	//private String name;

	// -----------------------------------------------------------------
	// Constructor: Creates an initially empty cart.
	// -----------------------------------------------------------------
	public ShoppingCart() {
		cart = new Item[capacity];
		itemCount = 0;
		totalPrice = 0.0;
		totalItems = 0;

	}

	// -----------------------------------------------------------------
	// Adds a Item to the cart, increasing the size of the array if necessary.
	// -----------------------------------------------------------------
	public void addToCart(Item newItem) {
		if (itemCount == cart.length)
			increaseSize();
		totalItems++;
		itemCount += newItem.getQuantity();		
		totalPrice += (newItem.getQuantity()) * (newItem.getPrice());
		cart[totalItems - 1] = newItem;
		// itemCount++;
	}

	// -----------------------------------------------------------------
	// Returns a report describing the Cart items.
	// -----------------------------------------------------------------

	public String toString() {
		
		String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "Shopping Cart:\n\n";
		report += "Item \tItem Price\tQuantity\tTotal\n";
		
		for (int item = 0; item < totalItems; item++) {
			report += cart[item].toString() + "\n";
		}
		report += "Total Price: " + fmt.format(totalPrice);
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

	public String quit() {
		String report2 = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report2 += "Thank you, Please pay: " + fmt.format(totalPrice);
		return report2;
	}

}
