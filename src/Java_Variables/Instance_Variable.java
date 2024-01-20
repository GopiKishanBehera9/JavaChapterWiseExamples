package Java_Variables;

public class Instance_Variable {

	//Declared Instance Variable
	public String geek;
	public int i;
	public Integer I;
	public Instance_Variable() {
		//Default Constructor
		//Initializing Instance Variable
		this.geek = "Gopi Kishan Behera";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Instance variables, represented by dot notation (object.variable), are used to access and modify the state of an object, ensuring unique data for each instance of the class.
		 */
		//Object Creation
		Instance_Variable name = new Instance_Variable();
		
		//Displaying O/P
		System.out.println("Geek name is: " + name.geek);
		System.out.println("Default value for int is "+ name.i);
		
		// toString() called internally
		System.out.println("Default value for Integer is "+ name.I);
		
	}

}
