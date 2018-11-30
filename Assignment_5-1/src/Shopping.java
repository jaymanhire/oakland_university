import java.util.Scanner;

public class Shopping {

	/* Creates Shopping Cart collection object and adds items to it. */

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();
		System.out.println("Welcome to Chatham grocery store!\n");
		Scanner scan = new Scanner(System.in);

		String keepShopping;

		do {

			System.out.println("Enter name of item: ");
			String item = scan.nextLine();

			System.out.println("Enter item price: ");
			double price = scan.nextDouble();

			System.out.println("Enter item quantity: ");
			int quantity = scan.nextInt();

			Item newItem = new Item(item, price, quantity);

			cart.addToCart(newItem);
			System.out.println(cart.toString() + "\n");

			keepShopping = scan.nextLine();

			System.out.println("Enter 'y' if you would like to continue shopping or Enter 'n' to quit");
			keepShopping = scan.nextLine();

		} while (keepShopping.equals("y"));

		System.out.println(cart.quit());
		scan.close();

	}
}
