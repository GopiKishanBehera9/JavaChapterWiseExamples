package Java_Constructor;

public class Constructor_Overloading {
	String language;

	//Constructor with no parameter
	Constructor_Overloading(){
		this.language = "Java";
	}

	//Constructor with a single parameter
	Constructor_Overloading(String language){
		this.language = language;
	}
	public void getName() {
		System.out.println("Programming Language: "+ this.language);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//What is constructor overloading ?
		//we can also create two or more constructors with different parameters. This is called constructors overloading.

		//call constructor with no parameter
		Constructor_Overloading obj1 = new Constructor_Overloading();

		//call constructor with a single parameter
		Constructor_Overloading obj2 = new Constructor_Overloading("Python");

		obj1.getName();
		obj2.getName();
	}

}
