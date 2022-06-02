package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();// Parent Class
		animal.animalInfo();

		Mammal mammal = new Mammal();// Child Class
		mammal.mammalInfo();
		mammal.animalInfo();

		Reptile reptile = new Reptile();// Single Inheritance
		reptile.reptileInfo();
		reptile.animalInfo();

		/*
		 Mammal, Reptile & Birds classes all extends Animal Class therefore is called
		 Hierarchical Inheritance
		 */
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		Robin robin = new Robin();// Multi-level Inheritance
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

	}

}
