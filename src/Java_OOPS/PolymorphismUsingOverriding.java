package Java_OOPS;

class Animal{
	public void makeSound() {
		System.out.println("The animal makes a sound");
	}
}

class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("The dog barks");
	}
}

class Cat extends Animal{
	@Override
	public void makeSound() {
		System.out.println("The cat meows");
	}
}
public class PolymorphismUsingOverriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		myDog.makeSound();// Calls the makeSound method of the Dog class
		myCat.makeSound();// Calls the makeSound method of the cat class
	}

}
