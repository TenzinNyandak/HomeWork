package hw10Abstraction;

public interface Hospital {
	public void emergencyRoom();
	public void surgeryRoom();
	public void cafeteria();
	
	public default void morgue() {
		System.out.println("This is default type method");
	}
	
	public static void pharmacy() {
		System.out.println("This is static type method");
	}

}
