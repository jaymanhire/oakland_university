import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

		int base;
		int exponent;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a base: ");
		base = scan.nextInt();

		System.out.println("Enter exponent: ");
		exponent = scan.nextInt();

		Power p = new Power();
		System.out.println(p.power(base, exponent));

		scan.close();
	}

	public double power(double base, double exp) {

		double result = 0;
		if (exp == 0) {
			result = 1;
		} else
			for (int i = 0; i < exp; i++) {
				result = Math.pow(base, i);
				System.out.println(base + "^" + i + " = " + result);
			}
		return result;

	}

}
