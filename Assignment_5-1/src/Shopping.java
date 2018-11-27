import java.util.Scanner;

public class Shopping {

	/* Creates Shopping Cart collection object and adds items to it. */

	public static void main(String[] args) {

		ShoppingCart items = new ShoppingCart();

		System.out.println("Enter name of item: ");
		Scanner scan = new Scanner(System.in);
		scan.hasNextLine();
		
		
		/*for (int index = 0; index < items.length; index++) {
			System.out.println("Enter number " + (index + 1) + ": ");
			numbers[index] = scan.nextDouble();*/

		

		/*
		 * System.out.println("Enter item price: "); scan.nextDouble();
		 * 
		 * 
		 * System.out.println("Enter item quantity: "); scan.nextInt();
		 */

		/*items.addToCart("Apple", 1.09, 4); // get user inputs into the array
		items.addToCart("Apple", 1.09, 4);*/
		System.out.println(items);

		

		scan.close();

	}

}
