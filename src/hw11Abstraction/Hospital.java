package hw11Abstraction;

public interface Hospital {
	public void emergencyRoom();
	public void surgeryRoom();
	public void cafeteria();
	
	public default void morgue() {
		System.out.println("morgue default type method from Hospital interface");
	}
	
	public static void pharmacy() {
		System.out.println("pharmacy static type method from Hospital interface");
	}

}
