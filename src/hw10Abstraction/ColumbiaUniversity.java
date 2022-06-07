package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool{
	
	/*
	 * Extends keyword is used for inheritance in a regular class 
	 * A regular class can only inherit one regular class or an abstract class by extends keyword 
	 * A regular class cannot inherit interface by extends keyword
	 */
	public void chemistry() {
		System.out.println("This is implemented method");
	}
	
	//public abstract void biology();
	//Class doesn't contain abstract method only non-abstract
	
	public ColumbiaUniversity() {//default constructor

	}

	@Override
	public void biochemistryLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caring() {
		// TODO Auto-generated method stub
		
	}
	
}

