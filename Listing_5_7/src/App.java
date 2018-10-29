import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		double sum = 0;
		double value = 0.0;
		double average = 0.0;
		int count = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an number(0 to quit): ");
		value = scan.nextDouble();

		while (value != 0) {
			count++;

			sum += value;
			System.out.println("The sum so far is: " + sum);

			System.out.println("Enter an number(0 to quit): ");
			value = scan.nextDouble();
		}
		System.out.println();

		if (count == 0) {
			System.out.println("No value were entered.");
		} else {
			average = (double) sum / count;
			DecimalFormat dcf = new DecimalFormat("0.###");
			System.out.println("The average is: " + dcf.format(average));
		}
		scan.close();
	}

}
