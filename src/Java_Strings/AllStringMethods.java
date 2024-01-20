package Java_Strings;

public class AllStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String greeting = "Hello, World!";
		String name = "Swapna";
		
		//Concatenation
		String message = greeting + " My name is " +name;
		System.out.println(message);  //output: Hello, World! My name is Swapna
		
		//String Length
		int length = greeting.length();
		System.out.println("Length of greeting: " + length);  //output: length of greeting: 13
		
		// String Indexing
        char firstChar = greeting.charAt(0);
        System.out.println("First character: " + firstChar);  // Output: First character: H

        // String Slicing
        String subString = greeting.substring(7, 12);
        System.out.println("Substring: " + subString);  // Output: Substring: World
        
        // String Repetition
        String repeatedString = name.repeat(3);
        System.out.println("Repeated name: " + repeatedString);  // Output: Repeated name: AliceAliceAlice

        // String Case Conversion
        String lowerCaseName = name.toLowerCase();
        String upperCaseGreeting = greeting.toUpperCase();
        System.out.println("Lowercase name: " + lowerCaseName);  // Output: Lowercase name: alice
        System.out.println("Uppercase greeting: " + upperCaseGreeting);  // Output: Uppercase greeting: HELLO, WORLD!

        // String Splitting
        String fruits = "apple,banana,cherry";
        String[] fruitArray = fruits.split(",");
        System.out.print("Fruits: ");
        for (String fruit : fruitArray) {
            System.out.print(fruit + " ");
        }
        // Output: Fruits: apple banana cherry

        // String Joining
        String[] colors = {"red", "green", "blue"};
        String colorList = String.join(", ", colors);
        System.out.println("\nColors: " + colorList);  // Output: Colors: red, green, blue

        // String Search and Replace
        String replacedGreeting = greeting.replace("World", "Universe");
        System.out.println("Replaced greeting: " + replacedGreeting);  // Output: Replaced greeting: Hello, Universe!

        // String Comparison
        String str1 = "apple";
        String str2 = "banana";
        boolean areEqual = str1.equals(str2);
        System.out.println("Are the strings equal? " + areEqual);  // Output: Are the strings equal? false
        
        
        
        
	}

}
