package Java_Regular_Expressions;

public class ReplacingText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "The quick brown fox jumps over the lazy dog.";
		String pattern = "fox";
		
		String replacedText = text.replaceAll(pattern, "cat");
		System.out.println("Replaced Text: "+ replacedText);
	}

}
