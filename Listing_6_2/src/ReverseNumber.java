import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 0;
		int lastDigit = 0;
		int reverse = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");

		number = scan.nextInt();

		do {
			lastDigit = number % 10;
			reverse = (reverse * 10) + lastDigit;
			number = number / 10;

		} while (number > 0);

		System.out.println("That number reversed is: " + reverse);
		scan.close();
		
		//System.out.println(23/10);

	}
	

}
