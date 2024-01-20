package Java_Operators;

public class Logical_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//In Java, logical operators like &&, ||, and! are used to perform operations on boolean values, making decisions in conditional statements and controlling program flow.
	
		//Logical AND(&&)
		boolean a = true;
		boolean b = false;
		System.out.println(a && b);
		
		//Logical OR (||)
		System.out.println(a || b);
		
		//Logical NOT (!)
		boolean c = true;
		System.out.println(!c);
		
		// if-else using 
		boolean x = true;
		boolean y = true;
		
		if(x && y) {
			System.out.println("It's a great day for outdoor activities!");
		}else {
			System.out.println("You might want to stay indoors.");
		}
		
	
	
	}

}
