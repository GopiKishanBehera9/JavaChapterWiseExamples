package Java_Variables;

public class Static_Variables {

	//Declared static variable
	public static String geek = "Gopi Kishan Behera";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Static variables, often denoted as constants or shared states across instances, are used to store and manage common data common to all objects of a class.
		 */
		
		
		// geek variable can be accessed without object
        // creation Displaying O/P GFG.geek --> using the
        // static variable
        System.out.println("Geek Name is : " + Static_Variables.geek);
 
        // static int c=0;
        // above line,when uncommented,
        // will throw an error as static variables cannot be
        // declared locally.
		
	}

}
