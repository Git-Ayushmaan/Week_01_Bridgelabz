import java.util.Scanner;

public class TextToUpperCase {
    // Method to convert a string to uppercase using ASCII logic
    public static String convertToUpperCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32)); // Convert to uppercase using ASCII value difference
            } else {
                result.append(ch); // Append the same character if not lowercase
            }
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Different lengths mean not equal
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Mismatch found
            }
        }
        return true; // Both strings are identical
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Using custom method to convert to uppercase
        String customUpper = convertToUpperCase(input);

        // Using built-in toUpperCase method
        String builtInUpper = input.toUpperCase();

        // Compare both results
        boolean areEqual = compareStrings(customUpper, builtInUpper);

        // Display the results
        System.out.println("Custom Uppercase: " + customUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both methods equal? " + areEqual);

        scanner.close();
    }
}
