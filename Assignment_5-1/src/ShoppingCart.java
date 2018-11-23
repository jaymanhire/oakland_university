
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
		totalCost += cost;
		count++;
	}

	// -----------------------------------------------------------------
	// Returns a report describing the DVD collection.
	// -----------------------------------------------------------------
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "My DVD Collection\n\n";
		report += "Number of DVDs: " + count + "\n";
		report += "Total cost: " + fmt.format(totalCost) + "\n";
		report += "Average cost: " + fmt.format(totalCost / count);
		report += "\n\nDVD List:\n\n";
		for (int dvd = 0; dvd < count; dvd++)
			report += collection[dvd].toString() + "\n";
		return report;
	}

	// -----------------------------------------------------------------
	// Increases the capacity of the collection by creating a
	// larger array and copying the existing collection into it.
	// -----------------------------------------------------------------
	private void increaseSize() {
		Item[] temp = new Item[collection.length * 2];
		for (int dvd = 0; dvd < collection.length; dvd++)
			temp[dvd] = collection[dvd];
		collection = temp;
	}
}
