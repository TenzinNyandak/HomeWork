package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		// constructor initialized
		AboutMe tenzin = new AboutMe();
		// variable initialized
		tenzin.name = "Tenzin Nyandak";
		tenzin.age = 29;
		tenzin.monthlyRent = 20000;
		tenzin.yearlySalary = 217837958;
		tenzin.phoneNumber = 2008638976748392l;
		tenzin.grade = 1.3544f;
		tenzin.height = 3.1983726;
		tenzin.sex = 'M';
		tenzin.usCitizen = true;
		// method initialized
		tenzin.aboutMe();

		// constructor initialized
		AboutMe alex = new AboutMe();
		// variable initialized
		alex.name = "Alex Caruso";
		alex.age = 31;
		alex.monthlyRent = 30000;
		alex.yearlySalary = 717000958;
		alex.phoneNumber = 108638976748392l;
		alex.grade = 1.67f;
		alex.height = 3.6415376;
		alex.sex = 'M';
		alex.usCitizen = false;
		// method initialized
		alex.aboutMe();
	}
}
