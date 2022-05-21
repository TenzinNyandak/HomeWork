package hw5Q3Constructor;

public class Student {
	// variables declared
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	// default constructor declared
	public Student() {
		System.out.println("This is from default Constructor of Student class.");
	}

	// parameterized constructor declared
	public Student(String stName, int stID, char sex, float grade, boolean isProgrammer) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name: " + stName + ", ID: EIT" + stID + ", Sex: " + sex + ", Grade: " + grade
				+ ", and Java Programmer? Ans: " + isProgrammer);
	}
}
