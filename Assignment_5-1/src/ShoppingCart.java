
import java.text.NumberFormat;

public class ShoppingCart {
	private Item[] collection;
	private int count;
	private double totalCost;

	// -----------------------------------------------------------------
	// Constructor: Creates an initially empty collection.
	// -----------------------------------------------------------------
	public ShoppingCart() {
		collection = new Item[100];
		count = 0;
		totalCost = 0.0;
	}

	// -----------------------------------------------------------------
	// Adds a Item to the collection, increasing the size of the array if necessary.
	// -----------------------------------------------------------------
	public void addItem(String name, double price, int quantity) {
		if (count == collection.length)
			increaseSize();
		collection[count] = new Item(name,price,quantity);
		totalCost += price;
		count++;
	}

	// -----------------------------------------------------------------
	// Returns a report describing the Cart items.
	// -----------------------------------------------------------------
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "My DVD Collection\n\n";
		report += "Number of DVDs: " + count + "\n";
		report += "Total cost: " + fmt.format(totalCost) + "\n";
		report += "Average cost: " + fmt.format(totalCost / count);
		report += "\n\nItem List:\n\n";
		for (int item = 0; item < count; item++)
			report += collection[item].toString() + "\n";
		return report;
	}

	// -----------------------------------------------------------------
	// Increases the capacity of the collection by creating a
	// larger array and copying the existing collection into it.
	// -----------------------------------------------------------------
	private void increaseSize() {
		Item[] temp = new Item[collection.length * 2];
		for (int item = 0; item < collection.length; item++)
			temp[item] = collection[item];
		collection = temp;
	}
}
