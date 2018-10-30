import java.util.Scanner;

public class PalindromeTester {

	public static void main(String[] args) {

		String str;
		String another = "y";
		int left;
		int right;

		Scanner scan = new Scanner(System.in);

		while (another.equalsIgnoreCase("y")) {
			System.out.println("Enter a potential palindrome: ");
			str = scan.nextLine();

			left = 0;
			right = str.length() - 1;

			while (str.charAt(left) == str.charAt(right) && left < right) {
				left++;
				right--;
			}
			System.out.println();

			if (left < right) {
				System.out.println("This is NOT a palindrome.");
			} else {
				System.out.println("This IS a palindrome.");
			}
			System.out.println();
			System.out.println("Test another palindrome (y/n)?");
			another = scan.nextLine();
		}
		scan.close();

	}

}
