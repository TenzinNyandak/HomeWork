package hw9Abstraction;

public interface University extends College, Hospital {
	/*
	 * Extends keyword is used for inheritance in Interface 
	 * An interface can inherit other Interfaces by extends keyword
	 * An interface cannot inherit a regular class or abstract class by extends keyword 
	 * An interface can inherit more than one interfaces
	 */
	
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {
		System.out.println("This is default type method");
	}

	public static void library() {
		System.out.println("This is static type method");
	}

}
