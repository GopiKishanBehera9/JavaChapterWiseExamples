package Java_Constructor;

public class No_Arg_Constructor {
	int i;
	//constructor with no parameter
	private No_Arg_Constructor() {
		i = 5;
		System.out.println("Constructor is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calling the constructor without any parameter
		No_Arg_Constructor obj = new No_Arg_Constructor();
		System.out.println("Vale of i: "+ obj.i);
	}

}
