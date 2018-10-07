import java.util.Random;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		Random rand = new Random();
		int randNum;
		randNum = rand.nextInt(90) + 10;

		String firstName;
		String lastName;
		String password;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		firstName = scan.nextLine();
		System.out.println("Enter your last name: "); 
		lastName = scan.nextLine();

		password = firstName.substring(0, 1) + lastName.substring(0, 5);

		System.out.println("Your password is: " + password + randNum);

		scan.close();

	}

}
