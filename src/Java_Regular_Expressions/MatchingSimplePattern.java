package Java_Regular_Expressions;

import java.util.regex.Pattern;

public class MatchingSimplePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Regular expressions (regex or regexp) are a powerful tool for pattern matching and text manipulation in Java.
		 */
		String text = "Hello, World!";
		String pattern = "Hello, World!";
		
		boolean isMatch = Pattern.matches(pattern, text);
		System.out.println("Match: "+isMatch);
	}

}
