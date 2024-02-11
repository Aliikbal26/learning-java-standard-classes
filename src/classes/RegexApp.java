package classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String text = "I have 12 apples and 5 oranges.";

        Pattern pattern = Pattern.compile("[a-zA-z]*[a][a-zA-Z]*"); // \\d matches any digit (0-9). +
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String result = matcher.group();
            System.out.println(result);
        }
    }
}
