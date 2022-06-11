package hw11Polymorphism;
/*
 * Method overriding is same method name, same signature/parameter but Overriding the logic of the method
 * Its also called late binding or dynamic binding or runtime polymorphism
 */


public class Niece extends Sister{
	
	@Override
	public int sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3;
		System.out.println("Total age from sister: " + total1);
		return total1;
	}

	@Override
	public int sister(int age1, int age2, int age3, String age4) {
		int total2 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println("Total age from sister: " + total2);
		return total2;
	}
	
	/*
	 * Static type method cannot be overridden because its the local method of the class
	 * If we remove the @override, it will work as the static method of this class
	 
	public static int sister(int age1, int age2, int age3, int age5) {
		int total3 = age1 + age2 + age3 + age5;
		System.out.println("Total age from sister: " + total3);
		return total3;
		}
	
	 * Final type method can't be overridden
 
	@Override 
	public final int sister(int age1, int age2) {
		int total4 = age1 + age2;
		System.out.println("Total age from sister: " + total4);
		return total4;
		}
	*/	

	@Override
	public void sister(String age4, int age5, int age6) {
		int total5 = Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total age from sister: " + total5);
	}
	
	@Override
	public void sister() {
		System.out.println("This is void type method from Sister class");
	}

}
