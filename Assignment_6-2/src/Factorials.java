
//Reads integers from the user and prints the factorial of each.

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) throws OutOfRangeException {

		String keepGoing = "y";

		Scanner scan = new Scanner(System.in);

		OutOfRangeException range = new OutOfRangeException("Must enter a positive integer.");
		IllegalArgumentException over16 = new IllegalArgumentException("Can not enter integer greater than 16.");

		while (keepGoing.equals("y") || keepGoing.equals("Y")) {

			try {
				System.out.print("Enter an integer: ");
				int val = scan.nextInt();

				if (val < 0)
					throw (range);
				if (val > 16)
					throw (over16);

				System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
				System.out.print("Another factorial? (y/n) ");
				keepGoing = scan.next();

			} catch (OutOfRangeException e) {
				// System.out.println("Please enter a non-negative integer."); //
				System.out.println(range.getMessage());

			} catch (IllegalArgumentException f) {
				System.out.println(over16.getMessage());
			}

		}
		scan.close();
	}
}
