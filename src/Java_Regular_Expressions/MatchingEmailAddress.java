package Java_Regular_Expressions;

import java.util.regex.Pattern;

public class MatchingEmailAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "Abhinash@gmail.com";
		String pttern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		
		boolean isMatch = Pattern.matches(pttern, email);
		System.out.println("Match: "+ isMatch);
	}

}
