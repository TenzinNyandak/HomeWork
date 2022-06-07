package hw10Abstraction;

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
		System.out.println("Default method is implemented here");
	}

	public static void library() {
		System.out.println("Static method is implemented here");
	}

}
