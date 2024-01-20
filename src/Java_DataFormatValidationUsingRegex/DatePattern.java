package Java_DataFormatValidationUsingRegex;

import java.util.regex.Pattern;

public class DatePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String date = "12/25/2023";
		String regex = "^(0[1-9]|1[0-2])[/\\-](0[1-9]|[12][0-9]|3[01])[/\\-]\\d{4}$";

		boolean isValid = Pattern.matches(regex, date);
		System.out.println("Is valid date: " + isValid);
	}

}
