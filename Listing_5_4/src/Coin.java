
public class Coin {

	final int HEADS = 0;
	final int TAILS = 1;

	private int face;

	public Coin() {
		flip();
	}

	public void flip() {
		face = (int) (Math.random() * 2);
	}

	// returns true if HEADS
	public boolean isHeads() {
		return (face == HEADS);
	}

	public String toString() {
		String faceName;   

		if (face == HEADS) {
			faceName = "Heads";
		} else {
			faceName = "Tails";
		}
		return faceName;
	}

}
