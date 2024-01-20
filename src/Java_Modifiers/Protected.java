package Java_Modifiers;

class Animal{
	//protected method
	protected void display() {
		System.out.println("I am an animal");
	}
}

public class Protected extends Animal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//What is protected access modifier?
		//When methods and data members are declared protected, we can access them within the same package as well as from subclasses.
		
		//create an object of Dog class
		Protected pro = new Protected();
		
		//access protected method
		pro.display();
		
	}

}
