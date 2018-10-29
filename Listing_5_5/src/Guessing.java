import java.util.Random;
import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {

		final int MAX = 10;
		int answer;
		int guess;

		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		answer = generator.nextInt(MAX) + 1;

		System.out.println("Thinking of a number between 1 and " + MAX + ". Guess what it is: ");

		guess = scan.nextInt();

		if (guess == answer) {
			System.out.println("You got it!");
		} else {
			System.out.println("Sorry, incorrect.");
			System.out.println("The answer was " + answer);

		}
		scan.close();
	}

}
