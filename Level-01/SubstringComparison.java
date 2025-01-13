
import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the original string: ");
        String inputString = kb.next();
        System.out.print("Enter the start index: ");
        int startIndex = kb.nextInt();
        System.out.print("Enter the end index: ");
        int endIndex = kb.nextInt();

        // Creating substrings
        String substringUsingCharAt = createSubstringUsingCharAt(inputString, startIndex, endIndex);
        String substringUsingBuiltIn = inputString.substring(startIndex, endIndex);

        // Comparing substrings
        boolean areEqual = compareStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

        // Displaying results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in substring(): " + substringUsingBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);
    }
}

