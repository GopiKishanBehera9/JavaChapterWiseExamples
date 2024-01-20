package Java_OOPS;

interface Soundable{
	void makeSound();
}

class Dog2 implements Soundable{
	@Override
	public void makeSound() {
		System.out.println("The dog barks");
	}
}

class Cat2 implements Soundable{
	@Override
	public void makeSound() {
		System.out.println("The cat meows");
	}
}

public class PolymorphismUsingInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Soundable myDog = new Dog2();
	        Soundable myCat = new Cat2();
	        
	        myDog.makeSound(); // Calls the makeSound method of the Dog class
	        myCat.makeSound(); // Calls the makeSound method of the Cat class
	}

}
