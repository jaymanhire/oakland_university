
public class Primes {

	public static void main(String[] args) {

		int[] primeNums = { 2, 3, 5, 7, 11, 13, 17, 19 };

		System.out.println("Array length: " + primeNums.length);

		System.out.println("The first few prime numbers sare: ");

		for (int i = 0; i < primeNums.length; i++) {
			System.out.print(primeNums[i] + "  ");
		}
		
		System.out.println();

		for (int prime : primeNums) {
			System.out.print(prime + "  ");
		}

	}

}
