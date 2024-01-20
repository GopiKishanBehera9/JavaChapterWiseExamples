package Java_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingMatchedText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "My phone numbers are 123-456-7890 and 987-654-3210";
        String pattern = "\\d{3}-\\d{3}-\\d{4}";
        
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Phone number: " + matcher.group());
	}

}
}
