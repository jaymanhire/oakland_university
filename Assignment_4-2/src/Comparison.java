import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {

		String str1, str2, str3;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter String 1 of 3: ");
		str1 = scan.nextLine();
		System.out.println("Enter String 2 of 3: ");
		str2 = scan.nextLine();
		System.out.println("Enter String 3 of 3: ");
		str3 = scan.nextLine();

		Compare3.largest(str1, str2, str3);
		
		System.out.println("----------------------------");
		
		String int1, int2, int3;		

		System.out.println("Enter integer 1 of 3: ");
		int1 = scan.nextLine();
		System.out.println("Enter integer 2 of 3: ");
		int2 = scan.nextLine();
		System.out.println("Enter integer 3 of 3: ");
		int3 = scan.nextLine();

		Compare3.largest(int1, int2, int3);
		
		
		
		scan.close();

	}

}
