package polymorphism;
/**
 * @author Chalaka Hasantha
 *
 */
class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Cat extends Animal {
	public void animalSound() {
		System.out.println("The cat says: Meeaw Meeaw");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}



public class Polymorphism {
	public static void main(String[] args) {
		Animal myAnimal = new Animal(); // Create a Animal object
		Animal myCat = new Cat(); // Create a Cat object
		Animal myDog = new Dog(); // Create a Dog object
		Animal myPig = new Pig(); // Create a Pig object
		myAnimal.animalSound();
		myCat.animalSound();
		myDog.animalSound();
		myPig.animalSound();
	}
}