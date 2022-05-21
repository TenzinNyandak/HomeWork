package hw5Q2Constructor;

public class Computer {
	// variables declared
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	// default constructor declared
	public Computer() {
		System.out.println("This is from default Constructor of Computer class.\n");
	}

	// parameterized constructor 01 declared
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My Brand: " + brand + ", Model: " + model + ", Operating system: " + operatingSystem
				+ ", Price: $" + price + ", Grade: " + grade + ", and Made in USA? Ans: " + madeInUSA);
	}
	// parameterized constructor 02 declared
	public Computer(String brand, String model, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price + ", Grade: " + grade
				+ ", Made in USA? Ans: " + madeInUSA);
	}

	// parameterized constructor 03 declared
	public Computer(String brand, String operatingSystem, int price, char grade) {
		this.brand = brand;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		System.out.println("Brand: " + brand + ", Operating system: " + operatingSystem + ", Price: $" + price
				+ ", Grade: " + grade);
	}
}