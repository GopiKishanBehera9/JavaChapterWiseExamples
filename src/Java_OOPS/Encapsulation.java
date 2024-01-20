package Java_OOPS;

class Student{
	private String name; //Private data field
	private int age;

	//Constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//Getter methods to access private data
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	//setter methods to modify private data
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		}
	}

}

public class Encapsulation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a Student object
		Student student = new Student("Swapna",22);

		//Access data using getter methods
		System.out.println("Name: "+student.getName());
		System.out.println("Age: "+student.getAge());

		//Modify data using setter methods
		student.setName("Bob");
		student.setAge(25);

		System.out.println("Updated Name: " + student.getName());
		System.out.println("Updated Age: " + student.getAge());
	}

}
