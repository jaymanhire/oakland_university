
public class Coin implements Lockable {

	private int key;
	//private int lock;
	//private int unlock;
	private int locked;

	final int HEADS = 0;
	final int TAILS = 1;
	//int locked = 1;

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
	

	@Override
	public void setKey(int key) {
		this.key = key;
	}

	@Override
	public int lock(int lock) {
		System.out.println("Locked.");
		return lock;
	}

	@Override
	public void unlock(int key) {
		System.out.println("Unlocked.");
	}

	@Override
	// returns true if HEADS
	public boolean locked() {
		return (locked == 0);
	}
	
		
}
