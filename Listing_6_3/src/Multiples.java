import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {

		final int PER_LINE = 5;
		int value = 0;
		int limit = 0;
		int multi = 0;
		int count = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a positive value: ");
		value = scan.nextInt();

		System.out.println("Enter an upper limit: ");
		limit = scan.nextInt();

		System.out.println();
		System.out.println("The multiples of " + value + " between " + value + " and " + limit + " (inclusive) are: ");

		for (multi = value; multi <= limit; multi += value) {
			System.out.print(multi + "\t");
			// Print a specific number of values per line of output
			count++;
			if (count % PER_LINE == 0)
				System.out.println();
		}
		scan.close();
	}

}
