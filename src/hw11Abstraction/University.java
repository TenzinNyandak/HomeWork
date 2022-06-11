package hw11Abstraction;

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
		System.out.println("gymnasium default type method from University class");
	}

	public static void library() {
		System.out.println("library static type method library from University class");
	}

}
