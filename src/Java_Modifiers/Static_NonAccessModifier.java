package Java_Modifiers;


class Static_gfg{
	//static variable
	static int count = 0;
	void myMethod() {
		count++;
		System.out.println(count);
	}
}

public class Static_NonAccessModifier {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * The static keyword applies entities outside a class instance, allowing static methods or attributes to be part of the class and saved memory.
		 * It makes programs more efficient by ensuring a static field exists across all instances.
		 */
		//first object creation
		Static_gfg obj1 = new Static_gfg();

		//method calling of first object
		obj1.myMethod();

		//Second object creation
		Static_gfg obj2 = new Static_gfg();

		//method calling of second object
		obj2.myMethod();
		
		//Second object creation
		Static_gfg obj3 = new Static_gfg();

		//method calling of second object
		obj3.myMethod();

	}

}
