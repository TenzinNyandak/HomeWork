package hw10UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("Default constructor is implemented here");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + name + ", Age: " + age + ", Sex: " + sex + " and is US citizen?: " + usCitizen);
	}
 
	public void father() {
		System.out.println("This is void type method from Father class");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + name + ", Age: " + age + ", Sex: " + sex + " and is US citizen?: " + usCitizen);

	}
}
