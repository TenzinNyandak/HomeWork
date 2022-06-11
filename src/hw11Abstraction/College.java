package hw11Abstraction;

public interface College {
	public void commonRoom();
	public void laboratory();
	public void languageClub();
	
	public default void dorm() {
		System.out.println("dorm default type method from College interface");
	}
	
	public static void studyRoom() {
		System.out.println("studyroom static type method from College interface");
	}

}
