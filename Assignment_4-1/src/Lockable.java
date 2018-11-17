
public interface Lockable {

	public void setKey(int key);

	public int lock(int key);

	public void unlock(int key);

	public boolean locked();

}
