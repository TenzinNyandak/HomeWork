package hw10Abstraction;

public interface Hospital {
	public void emergencyRoom();
	public void surgeryRoom();
	public void cafeteria();
	
	default void morgue() {
	}
	
	static void pharmacy() {
	}

}
