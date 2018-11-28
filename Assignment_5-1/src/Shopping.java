import java.util.Scanner;

public class Shopping {

	/* Creates Shopping Cart collection object and adds items to it. */

	public static void main(String[] args) {

		ShoppingCart items = new ShoppingCart();

		System.out.println("Enter name of item: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

		System.out.println("Enter item price: ");
		double price = scan.nextDouble();

		System.out.println("Enter item quantity: ");
		int quantity = scan.nextInt();

		System.out.println("Enter 'y' if you would like to keep shopping or Enter 'n' to quit\n");

		// Item item = new Item(name, price, quantity);
		// System.out.println(item.getName());

		items.addToCart(name, price, quantity);
		System.out.println(items);

		// System.out.println(item.toString());

		/*
		 * for (int index = 0; index < items.length; index++) {
		 * System.out.println("Enter number " + (index + 1) + ": "); numbers[index] =
		 * scan.nextDouble();
		 */

		scan.close();

	}

}
