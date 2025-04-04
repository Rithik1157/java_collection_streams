package regex.extract_capital_letter_word;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizeWord {

	public static void main(String[] args) {
		 String text = "The Eiffel Tower is Statue of Liberty is in New York.";

	        // Regular expression for capitalized words
	        String regex = "\\b[A-Z][a-z]*\\b";

	        // Compile the pattern
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(text);

	        // Print all matched capitalized words
	        System.out.println("Extracted Capitalized Words:");
	        while (matcher.find()) {
	            System.out.print(matcher.group() + " ");
	        }
	}

}
