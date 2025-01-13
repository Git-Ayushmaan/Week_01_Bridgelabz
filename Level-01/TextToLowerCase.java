import java.util.Scanner;

public class TextToLowerCase {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the text:");
        String input = kb.nextLine();

        String upperCaseText = input.toUpperCase();
        String convertedText = convertToUpperCase(input);

        boolean areEqual = compareStrings(upperCaseText, convertedText);

        System.out.println("Uppercase Text: " + convertedText);
        System.out.println("Comparison Result: " + areEqual);
    }

    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
