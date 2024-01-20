package Java_Methods;

public class MethodCodeReusability {
	// method defined
	  private static int getSquare(int x){
	    return x * x;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {

		      // method call
		      int result = getSquare(i);
		      System.out.println("Square of " + i + " is: " + result);
		}
	}

}
