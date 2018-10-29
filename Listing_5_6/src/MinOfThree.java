import java.util.Scanner;

public class MinOfThree {		

	public static void main(String[] args) {	

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int min = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter three Integers: ");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (num1 < num2)
			if (num1 < num3)
				min = num1;
			else
				min = num3;
		else if (num2 < num3)
			min = num2;
		else
			min = num3;
		System.out.println("Minimum value: " + min);
		scan.close();
		/*
		 * if (num1 < num2 && num1 < num3) { min = num1; } else if (num2 < num1 && num2
		 * < num3) { min = num2; } else { min = num3; }
		 * System.out.println("Minimum value: " + min);
		 * 
		 * }
		 */

	}

}
