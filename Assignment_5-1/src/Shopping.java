import java.util.Scanner;

public class Shopping {

	// Creates DVD collection object and adds some DVD's to it. Prints
	// reports on the status of the collection.

	public static void main(String[] args) {

		ShoppingCart items = new ShoppingCart();
		
		System.out.println("Enter name of item: ");
		Scanner scan  = new Scanner(System.in);
		scan.hasNextLine();
		
		System.out.println("Enter item price: ");
		scan.nextDouble();
		
		
		System.out.println("Enter item quantity: ");
		scan.nextInt();
		
		
		items.addItem(name, price, quantity);

	

	}

}
