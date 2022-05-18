package hw4JavaVariables;


public class AboutMe {
	public String name;
	//variable declared
	public byte age;
	public short monthlyRent;
	public int yearlySalary;
	public long phoneNumber;
	public float grade;
	public double height;
	public char sex;
	public boolean usCitizen;

	// constructor declared
	public AboutMe() {
		System.out.println("\nThis is all about us: \n");
	}

	// method implemented
	public void aboutMe() {
		System.out.println("Name: " + name + "\nAge: " + age + "\nMonthly Rent: " + monthlyRent + "\nYearly Salary: " + yearlySalary + "\nPhone Number: " + phoneNumber + "\nGrade: " + grade + "\nHeight: " + height + "\nSex: " + sex + "\nUS Citizen: " + usCitizen);
	}
}
