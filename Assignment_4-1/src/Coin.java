import java.util.Scanner;

public class Coin implements Lockable {

	private static int key;
	private static int lock;
	private static int unlock;

	public static void main(String[] args) {

		System.out.println("Enter an integer to set key and lock: ");
		Scanner scan1 = new Scanner(System.in);

		Coin coin1 = new Coin();
		key = scan1.nextInt();
		coin1.setKey(key);
		coin1.lock(key);

		System.out.println("Enter key to unlock: ");
		if (key == scan1.nextInt()) {
			coin1.unlock(key);
		} else {
			System.out.println("Incorrect....");
			coin1.lock(key);
		}

	}

	@Override
	public void setKey(int key) {
		Coin.key = key;
	}

	@Override
	public void lock(int key) {
		System.out.println("Locked.");
	}

	@Override
	public void unlock(int key) {
		System.out.println("Unlocked.");
	}

	@Override
	public boolean locked() {
		return (key == lock);
	}
}
