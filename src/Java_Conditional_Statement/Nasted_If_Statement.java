package Java_Conditional_Statement;

public class Nasted_If_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
        int y = 5;

        if (x > 5) {
            System.out.println("x is greater than 5");
            if (y > 2) {
                System.out.println("y is also greater than 2");
            } else {
                System.out.println("y is not greater than 2");
            }
        } else {
            System.out.println("x is not greater than 5");
        }
	}

}
