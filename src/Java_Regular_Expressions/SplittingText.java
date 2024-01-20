package Java_Regular_Expressions;

public class SplittingText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "apple,banana,grape,orange";
		String[] fruits = text.split(",");
		
		for(String fruit : fruits) {
			System.out.println(fruits);
		}
	}

}
