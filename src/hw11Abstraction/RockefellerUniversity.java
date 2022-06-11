package hw11Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool{
	
	public void maths() {
		System.out.println("This is a non abstract method from RockerfellerUniversity class");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("aeronauticalInfo method from AeronauticalSchool");
	}

	@Override
	public void computerLab() {
		System.out.println("computerLab method from EngineeringSchool abstract class");		
	}

}
