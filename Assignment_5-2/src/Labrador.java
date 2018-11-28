

// A class derived from Dog that holds information about
// a labrador retriever. Overrides Dog speak method and includes
// information about avg weight for this breed.
//
// ****************************************************************
public class Labrador extends Dog {

	private String color; // black, yellow, or chocolate?

	private static int breedWeight = 75;

	public Labrador(String name, String color) {
		super(name);
		this.setColor(color);

	}

	// ------------------------------------------------------------
	// Big bark -- overrides speak method in Dog
	// ------------------------------------------------------------
	public String speak() {
		return "WOOF";
	}

	// ------------------------------------------------------------
	// Returns weight
	// ------------------------------------------------------------
	public static int avgBreedWeight() {
		return breedWeight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
