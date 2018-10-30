import java.text.NumberFormat;
import java.util.Scanner;

public class WinPercentage {

	public static void main(String[] args) {

		/*
		 * Keep in mind that for each iteration of the outer loop, the inner loop exe-
		 * cutes completely---This prints("Here again") 18 times
		 */

		{
			int count1, count2;
			count1 = 1;
			while (count1 <= 2) {
				count2 = 1;
				while (count2 <= 3) {
					System.out.println("Here again");
					count2++;
				}
				count1++;
			}

			final int NUM_GAMES = 12;
			int won;
			double ratio;

			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the number of games won (0 to " + NUM_GAMES + "): ");

			won = scan.nextInt();
			while (won < 0 || won > NUM_GAMES) {
				System.out.println("Invalid Input, Please re-enter: ");
				won = scan.nextInt();
			}
			ratio = (double) won / NUM_GAMES;
			NumberFormat fmt = NumberFormat.getPercentInstance();
			System.out.println();
			System.out.println("Winning Percentage: " + fmt.format(ratio));

			scan.close();
		}

	}
}
