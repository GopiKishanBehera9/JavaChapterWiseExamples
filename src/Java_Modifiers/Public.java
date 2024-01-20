package Java_Modifiers;

//Public class
public class Public {
	// public variable
	public int legCount;

	// public method
	public void display() {
		System.out.println("I am an animal.");
		System.out.println("I have " + legCount + " legs.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//What is the use of access modifiers in Java?
		//Access Modifiers in Java are used to control the visibility of fields, methods, classes and constructors.

		// accessing the public class
		Public animal = new Public();

		// accessing the public variable
		animal.legCount = 4;
		// accessing the public method
		animal.display();
	}

}
