package Java_Constructor;

public class Public_No_Arg_constructor {
		String name;
		
		//public constructor
		public Public_No_Arg_constructor() {
			name = "Abhi Programmer";
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object is created in another class
		Public_No_Arg_constructor obj = new Public_No_Arg_constructor();
		System.out.println("Company name = "+ obj.name);
	}

}
