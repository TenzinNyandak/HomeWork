package hw3JavaVariables;

public class AboutMe {
	// Variable declared
	public int houseNumber;
	// Variables initialized
	public String name = "Tenzin Nyandak";
	public byte age = 29;
	public short rent = 20000;
	public int salary = 217832129;
	public long phoneNumber = 2009178552647768l;
	public float grade = 1.53273f;
	public double myHeight = 3.25644478989;
	public char mySex = 'M';
	public boolean tibetan = true;

	public static void main(String[] args) {
		// AboutMe class is instantiated here.
		AboutMe aboutMe = new AboutMe();
		System.out.println("Name: " + aboutMe.name + "\nAge: " + aboutMe.age + "\nSex: " + aboutMe.mySex);
	}
}
