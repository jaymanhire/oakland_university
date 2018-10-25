import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		final int MINOR = 21;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your age: ");

		int age = scan.nextInt();
		System.out.println("You entered: " + age);

		if (age < MINOR) {
			System.out.println("Youth is a wonderful thing. Enjoy it.");
		} else {
			System.out.println("Age is a state of mind.");
		}
		scan.close();

	}

}
