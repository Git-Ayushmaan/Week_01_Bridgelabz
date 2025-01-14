import java.util.Scanner;

public class TextToLowerCaseNew {
    // Method to manually convert a string to lowercase using ASCII logic
    public static String convertToLowerCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Method to compare two strings character by character
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

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // Take user input
        System.out.println("Enter a string:");
        String userInput = kb.nextLine();

        // Convert to lowercase manually
        String manualLowerCase = convertToLowerCase(userInput);

        // Convert using built-in method
        String builtInLowerCase = userInput.toLowerCase();

        // Compare the two methods
        boolean isEqual = compareStrings(manualLowerCase, builtInLowerCase);

        // Display results
        System.out.println("Manual lowercase conversion: " + manualLowerCase);
        System.out.println("Built-in lowercase conversion: " + builtInLowerCase);
        System.out.println("Are they equal? " + isEqual);
    }
}