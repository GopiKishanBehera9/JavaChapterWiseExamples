package Java_ClassAndObject;

public class Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//What is class?
		// A class is a blueprint or a template for creating objects.
		
		// What is Object?
		//an object is an instance of a class. Classes and objects are fundamental concepts in object-oriented programming (OOP), and they allow you to model real-world entities and their behaviors in your software.
	
		//Creating objects of the Car class
		CarClass car1 = new CarClass("Toyota","Camry",2020);
		CarClass car2 = new CarClass("Honda","Civic",2022);
	
		//Accessing object fields and methods
		System.out.println("Car 1: "+ car1.make +" "+ car1.model+ " (" + car1.year + ")");
		car1.start();
        car1.drive();
        
        System.out.println("Car 2: " + car2.make + " " + car2.model + " (" + car2.year + ")");
        car2.start();
        car2.drive();
        
		
		
	}

}
