package hw11Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool{
	/*
	 * Extends and Implements keywords are used for inheritance in a regular class 
	 * A regular class can only inherit one regular class or an abstract class by extends keyword 
	 * A regular class cannot inherit interface by extends keyword
	 * A regular class can inherit interface by implements keyword
	 */
	
	public void chemistry() {
		System.out.println("This is method implemented from ColumbiaUniversity class");
	}
	
	//public abstract void biology();
	//Class doesn't contain abstract method only non-abstract
	
	public ColumbiaUniversity() {//default constructor
		System.out.println("This is default constructor of ColumbiaUniversity class");
	}
	
	public static void columbiaUniversity() {
		System.out.println("This is static method from ColumbiaUniversity class");
	}
	
	@Override
	public void biochemistryLab() {
		System.out.println("biochemistryLab method from MedicalSchool Abstract class");		
	}

	@Override
	public void caring() {
		System.out.println("caring method from NursingSchool class");		
	}

	@Override
	public void commonRoom() {
		System.out.println("commonRoom method from College interface");				
	}

	@Override
	public void laboratory() {
		System.out.println("laboratory method from College interface");				
		}

	@Override
	public void languageClub() {
		System.out.println("languageClub method from College interface");						
	}

	@Override
	public void emergencyRoom() {
		System.out.println("emergencyRoom method from Hospital interface");				
	}

	@Override
	public void surgeryRoom() {
		System.out.println("surgeryRoom method from Hospital interface");				
	}

	@Override
	public void cafeteria() {
		System.out.println("cafeteria method from Hospital interface");				
	}

	@Override
	public void lawInfo() {
		System.out.println("lawInfo method from LawSchool Interface");
	}

	@Override
	public void classSize() {
		System.out.println("classSize method from University interface");		
	}

	@Override
	public void playGround() {
		System.out.println("playGround method from University interface");				
	}

	@Override
	public void teacher() {
		System.out.println("teacher method from University interface");		
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("aeronauticalInfo method from AeronauticalSchool interface");		
	}

	@Override
	public void vocationalInfo() {
		System.out.println("vocationalInfo method from VocationalSchool interface");
	}

	@Override
	public void computerLab() {
		System.out.println("computerLab method from EngineeringSchool class");			
	}
	
}

