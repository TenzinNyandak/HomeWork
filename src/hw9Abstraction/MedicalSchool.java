package hw9Abstraction;

public abstract class MedicalSchool {
	
	//non abstract method 
	public void anatomyLab() {
		System.out.println("This is a method implemented");
	}
	
	//abstract method
	public abstract void biochemistryLab();
	//default constructor declared
	public MedicalSchool() {
		System.out.println("This is a default constructor");
	}
}
