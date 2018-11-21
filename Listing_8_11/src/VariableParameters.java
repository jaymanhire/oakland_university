
public class VariableParameters {

	public static void main(String[] args) {

		// Creates two Family objects using a constructor that accepts
		// a variable number of String objects as parameters.
		Family lewis = new Family("John", "Sharon", "Justin");

		Family camden = new Family("Steve", "Annie", "Matt", "Mary");

		System.out.println(lewis);
		System.out.println();
		System.out.println(camden);

	}

}
