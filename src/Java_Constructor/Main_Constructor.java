package Java_Constructor;

public class Main_Constructor {
	private String name;
	
	// constructor
	Main_Constructor(){
		System.out.println("Constrictor Called:");
		name = "Programmer";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//constructor is invoked while
		//creating an object of the Main class
		Main_Constructor obj = new Main_Constructor();
		System.out.println("The name is "+ obj.name);
	}

}
