package hw10Abstraction;

public interface College {
	public void commonRoom();
	public void laboratory();
	public void languageClub();
	
	public default void dorm() {
		System.out.println("This is the default type method");
	}
	
	public static void studyRoom() {
		System.out.println("This is the static type method");
	}

}
