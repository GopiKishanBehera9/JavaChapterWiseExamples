package Java_OOPS;


class Vehicle{
	String make;
	int year;
	
	public Vehicle(String make, int year) {
		this.make = make;
		this.year = year;
	}
	public void displayInfo() {
		System.out.println("Make: "+ make);
		System.out.println("Year: "+ year);
	}
}

//Child Class inheriting from Vehicle
class Car extends Vehicle{
	String model;
	
	public Car(String make, String model, int year) {
		super(make, year); //Call the constructor of the parent class
		this.model = model;
	}
	
	public void displayCarInfo() {
		displayInfo(); //Call the method from the parent class
		System.out.println("Model: " + model);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car("Toyota","Camry",2020);
		myCar.displayCarInfo();
	}

}
