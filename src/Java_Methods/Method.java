package Java_Methods;

public class Method {
	//create a method
	public int addNumbers(int a, int b ) {
		int sum = a+b;
		//return value
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 25;
		int num2 = 15;

		//create an object of Method
		Method obj = new Method();

		//calling method
		int result = obj.addNumbers(num1, num2);
		System.out.println("Sum is: " + result);
	}

}
