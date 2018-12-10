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

		double result;
		if (exp == 0) {
			result = 1;
		} else
			result = power(exp - 1, base - 1);
		result = Math.pow(base, exp);		

		return result;

	}

}
