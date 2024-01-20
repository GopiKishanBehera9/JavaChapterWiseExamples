package Java_OOPS;


//Abstract class
abstract class Shape{
	//Abstract mehtod(no implementation)
	public abstract double calculateArea();
	
	//Concrete method(with implementation)
	public void display() {
		System.out.println("This is a Shape.");
	}
}

//Concrete Subclass Circle
class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//Implement the abstract method
	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
}

//concrete Subclass Rectangle
class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	//Implement the abstract method
	@Override
	public double calculateArea() {
		return length * width;
	}
}
public class Abstraction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle(5.0);
		Rectangle rectangle = new Rectangle(4.0,6.0);
		
		//Using abstract mehthods and concrete methods
		circle.display();
		System.out.println("Circle Area: "+circle.calculateArea());
		
		rectangle.display();
		System.out.println("Rectangle Area: "+ rectangle.calculateArea());
		
		
	}

}
