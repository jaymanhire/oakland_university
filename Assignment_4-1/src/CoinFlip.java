import java.util.Scanner;

public class CoinFlip {

	private static int keyNum;

	public static void main(String[] args) {

		Coin coin1 = new Coin();

		System.out.println("Enter an integer to set key: ");
		Scanner scan1 = new Scanner(System.in);
		keyNum = scan1.nextInt();
		
		coin1.setKey(keyNum);
		System.out.println("The key is: " + keyNum); 

		System.out.println("Enter the key to lock: ");

		if (keyNum == scan1.nextInt()) {
			coin1.lock(keyNum);
			System.out.print("Locked? " );
			System.out.println(coin1.locked());

		} else {
			System.out.print("Locked? " );
			System.out.println(coin1.locked() == false);
		}
		//System.out.println(coin1.locked());

		System.out.println("Enter key to unlock: ");

		if (keyNum == scan1.nextInt()) {
			coin1.unlock(keyNum);
			Coin myCoin = new Coin();
			myCoin.flip();

			System.out.println(myCoin);

			if (myCoin.isHeads()) {
				System.out.println("You win!");
			} else {
				System.out.println("Better luck next time.");
			}
		} else {
			System.out.println("Incorrect key....");
			coin1.lock(keyNum);
		}
		scan1.close();

	}

}
