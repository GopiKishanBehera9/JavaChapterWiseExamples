package Java_ClassAndObject;

public class CarClass {

	//Fields (attributes)
	String make;
	String model;
	int year;
	
	//Constructor (speial method ised for object initialization)
	public CarClass(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	//Methods(behaviors)
	public void start() {
		System.out.println("The car is Starting");
	}
	
	public void drive() {
        System.out.println("The car is moving.");
    }
	
}
