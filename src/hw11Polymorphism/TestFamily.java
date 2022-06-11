package hw11Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("\n----------Sister----------");
		Sister sister = new Sister();
		sister.sister(5, 13, 20);
		sister.sister(6, 10, 15, "21");
		Sister.sister(7, 11, 16, 12);
		sister.sister(18, 25);
		sister.sister("9", 17, 30);
		sister.sister();
		
		System.out.println("\n----------Neice----------");
		Niece niece = new Niece();
		niece.sister(5, 13, 20);
		niece.sister(6, 10, 15, "21");
		niece.sister("9", 17, 30);
		niece.sister();
	}

}
