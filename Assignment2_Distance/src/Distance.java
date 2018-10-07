import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		float x1;
		float x2;
		float y1;
		float y2;
		float sum_x;
		float sum_y;
		float distance_x;
		float distance_y;
		float distance_sum;
		float distance_sqr;
		float cost;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter x1: ");
		x1 = scan.nextFloat();
		System.out.println("Enter y1: ");
		y1 = scan.nextFloat();
		System.out.println("Enter x2: ");
		x2 = scan.nextFloat();
		System.out.println("Enter y2: ");
		y2 = scan.nextFloat();

		sum_x = (x1 - x2);
		sum_y = (y1 - y2);

		distance_x = (float) Math.pow(sum_x, 2);
		distance_y = (float) Math.pow(sum_y, 2);
		distance_sum = distance_x + distance_y;
		distance_sqr = (float) Math.sqrt(distance_sum);
		cost = distance_sqr * 0.43f;

		System.out.printf("Distance between the points is: %.3f\n", distance_sqr);
		System.out.printf("The travel cost is: $%.3f", cost);

		scan.close();
	}

}