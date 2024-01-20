package Java_Modifiers;

class Data{
	//private variable
	private String name;
	
	//getter method
	public String getName() {
		return this.name;
	}
	//setter method
	public void setName(String name) {
		this.name = name;
	}
}

public class Private {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Private members are only accessible within the class in which they are defined.
		 */
		//create an object of Data
		Data d = new Data();
		
		//access private variable and field from another class
		d.setName("Programmer");
		System.out.println(d.getName());
		
		
	}

}
