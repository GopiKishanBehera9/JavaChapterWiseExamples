package Java_Regular_Expressions;

import java.util.regex.Pattern;

public class MatchingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "12345";
		String pattern = "12345"; //Matches one or more digits
		
		boolean isMatch = Pattern.matches(pattern, text);
		System.out.println("Match: "+isMatch);
	}

}
