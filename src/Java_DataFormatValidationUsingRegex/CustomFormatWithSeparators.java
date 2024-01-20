package Java_DataFormatValidationUsingRegex;

import java.util.regex.Pattern;

public class CustomFormatWithSeparators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String date = "2023/12/25";
	        String regex = "^\\d{4}[/\\-]\\d{2}[/\\-]\\d{2}$";

	        boolean isValid = Pattern.matches(regex, date);
	        System.out.println("Is valid date: " + isValid);
	}

}
