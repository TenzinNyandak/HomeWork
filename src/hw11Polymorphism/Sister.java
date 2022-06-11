package hw11Polymorphism;

/*
 * Method overloading is same method name but different combination on parameter
 * Its also called early binding or static binding or compile time polymorphism
*/
public class Sister {

	// Return type parameterized method implemented
	public int sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3;
		System.out.println("Total age from sister: " + total1);
		return total1;
	}

	public int sister(int age1, int age2, int age3, String age4) {
		int total2 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println("Total age from sister: " + total2);
		return total2;
	}

	// Static type method implemented
	public static int sister(int age1, int age2, int age3, int age5) {
		int total3 = age1 + age2 + age3 + age5;
		System.out.println("Total age from sister: " + total3);
		return total3;
	}

	// Return type parameterized method which is final implemented
	public final int sister(int age1, int age2) {
		int total4 = age1 + age2;
		System.out.println("Total age from sister: " + total4);
		return total4;
	}

	// void type parameterized method is implemented
	public void sister(String age4, int age5, int age6) {
		int total5 = Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total age from sister: " + total5);
	}

	// void type method is implemented
	public void sister() {
		System.out.println("This is void type method from Sister class");
	}
}
