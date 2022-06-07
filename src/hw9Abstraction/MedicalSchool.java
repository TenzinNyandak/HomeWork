package hw9Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	/*
	 * Extends keyword is used for inheritance in an abstract class 
	 * An abstract class can only inherit one abstract class or a regular class by extends keyword 
	 * An abstract class cannot inherit interface by extends keyword
	 */

	// non abstract method
	public void anatomyLab() {
		System.out.println("This is a method implemented");
	}

	// abstract method
	public abstract void biochemistryLab();

	// default constructor declared
	public MedicalSchool() {
		System.out.println("This is a default constructor");
	}
}
