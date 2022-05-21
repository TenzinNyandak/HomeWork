package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		// constructor initialized
		Computer computer = new Computer();
		// parameterized constructor 01 initialized
		Computer computer1 = new Computer("Apple", "Macbook air", "MacOS Mojave", 800, 'A', false);
		// parameterized constructor 02 initialized
		Computer computer2 = new Computer("Apple", "iMac", 3645, 'B', false);
		// parameterized constructor 03 initialized
		Computer computer3 = new Computer("Dell", "Windows", 2733, 'C');
	}
}
