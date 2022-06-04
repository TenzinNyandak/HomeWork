package hw9Abstraction;

public interface University {
	public void classSize();
	public void playGround();
	public void teacher();
	
	default void gymnasium() {
	}
	
	static void library() {
	}
	
	
}
