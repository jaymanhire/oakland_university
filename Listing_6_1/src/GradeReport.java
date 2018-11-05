import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {

		int grade;
		int category;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a numeric grade (0 to 100): ");
		grade = scan.nextInt();

		category = grade / 10;

		System.out.print("That grade is ");

		switch (category) {
		case 10:
			System.out.println("a perfect score. Well done!");
			break;
		case 9:
			System.out.println("well above average. Excellent.");
			break;
		case 8:
			System.out.println("above average. Nice job.");
			break;
		case 7:
			System.out.println("average.");
			break;
		case 6:
			System.out.println("below average.");
			break;
		default:
			System.out.println("terrible. You suck, and you failed, loser.");

		}
		scan.close();

		int num1 = 3;
		int num2 = 76;
		int greater = (num1 > num2) ? num1 + 1000 : num1 * 2;
		System.out.println(greater);

	}

}
