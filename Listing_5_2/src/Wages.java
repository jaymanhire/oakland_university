import java.text.NumberFormat;
import java.util.Scanner;

class Wages {

	public static void main(String[] args) {

		final float RATE = 22.00f;
		final int REG_HOURS = 40;
		final float OVERTIME_RATE = RATE * 1.5F;

		Scanner scan = new Scanner(System.in);

		float pay = 0.0f;

		System.out.println("Enter the number of hours worked: ");
		int hours = scan.nextInt();
		System.out.println();

		if (hours > REG_HOURS) {
			pay = REG_HOURS * RATE + (hours - REG_HOURS) * (OVERTIME_RATE);
		} else {
			pay = hours * RATE;
		}
		NumberFormat numFmt = NumberFormat.getCurrencyInstance();
		System.out.println("Gross Pay: " + numFmt.format(pay));
		
		scan.close();

	}
}