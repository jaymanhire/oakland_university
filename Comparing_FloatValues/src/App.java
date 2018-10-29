
public class App {

	private static final float TOLERANCE = .0001f;

	public static void main(String[] args) {

		float f1 = 654.0880f;
		float f2 = 654.0883f;

		if (Math.abs(f1 - f2) < TOLERANCE) {
			System.out.println("Essentially equal.");
		} else {
			System.out.println("Not equal.");
		}

	}

}
