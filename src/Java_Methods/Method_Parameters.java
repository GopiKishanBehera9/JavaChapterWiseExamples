package Java_Methods;

public class Method_Parameters {
	//method with no parameter
	public void display1() {
		System.out.println("Method without parameter");
	}
	//mehtod with single parameter
	public void display2(int a) {
		System.out.println("Method with a single parameter: "+ a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an object of Method_Parameters
		Method_Parameters obj = new Method_Parameters();

		//calling method with no parameter
		obj.display1();

		//calling method with the single parameter
		obj.display2(24);
	}

}
