package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super("Tom", 30, 'M', true);

		super.father();
		super.fatherInfo("John", 32, 'M', false);
		super.familyName = "Smith";
		System.out.println("Family name: " + familyName);

		System.out.println("This is a default constructor implemented");

	}

	public Daughter(String birthMonth, int age) {
		super("Tom", 30, 'M', true);

		super.father();
		super.fatherInfo("John", 32, 'M', false);

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month: " + birthMonth + " and age: " + age);
	}

	public void daughter() {
		super.father();
		super.fatherInfo("Bob", 34, 'M', true);
		super.familyName = "Brown";
		System.out.println("Family name: " + familyName);

		System.out.println("This is void type method from Daughter class");
	}

	public void daugherInfo(String birthMonth, int age) {
		super.father();
		super.fatherInfo("James", 32, 'M', false);

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month: " + birthMonth + " and age: " + age);
	}

}
