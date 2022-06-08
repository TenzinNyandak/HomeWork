package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool{
	/*
	 * Extends and Implements keywords are used for inheritance in an abstract class 
	 * An abstract class can only inherit one abstract class or a regular class by extends keyword 
	 * An abstract class cannot inherit interface by extends keyword
	 * An abstract class can inherit interface by implements keyword
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
