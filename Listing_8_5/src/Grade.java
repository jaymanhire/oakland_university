
public class Grade {

	private String name;
	private int lowerBound;

	// Constructor: Sets up this Grade object with the specified grade name and
	// numeric lower bound.

	public Grade(String grade, int cutoff) {
		name = grade;
		lowerBound = cutoff;
	}

	// Returns a string representation of this grade.
	public String toString() {
		return name + "\t" + lowerBound;
	}

	// Name mutator
	public void setName(String grade) {
		name = grade;
	}

	// lower bound mutator
	public void setLowerBound(int cutoff) {
		lowerBound = cutoff;
	}

	// Name accessor.
	public String getName() {
		return this.name;
	}

	// Lower bound accessor
	public int getLowerBound() {
		return this.lowerBound;
	}

}
