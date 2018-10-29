
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
		System.out.println();

		char ch1 = 't';
		char ch2 = 'c';

		if (ch1 > ch2) {
			System.out.println(ch1 + " is greater than " + ch2);
		} else {
			System.out.println(ch2 + " is greater than " + ch1);
		}

		System.out.println();

		String name1 = "This is a string.";
		String name2 = "This is a String.";

		if (name1.equalsIgnoreCase(name2)) {
			System.out.println("These strings are the same.");
		} else {
			System.out.println("These strings are not the same.");
		}

		System.out.println();

		String str = "software";
		if (str == "software")
			System.out.println("References are the same");
		if (str.equals("software"))
			System.out.println("Characters are the same");
		
		System.out.println();

		String name11 = "Able";
		String name12 = "Baker";
		int result = name11.compareTo(name12); {

			if (result < 0) {
				System.out.println(name11 + " comes before " + name12);
			} else if (result == 0) {
				System.out.println("The names are equal.");
			} else {
				System.out.println(name11 + " follows " + name12);
			}
		}
	}
}
