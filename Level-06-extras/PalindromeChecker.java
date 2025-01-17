import java.util.Scanner;

public class PalindromeChecker {

    // Method for user input
    private static String inputString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        String cleanedString = str.replaceAll("[\\W_]", "").toLowerCase();
        return cleanedString.equals(new StringBuilder(cleanedString).reverse().toString());
    }

    // Method to display the result
    private static void displayResult(String str, boolean isPalindrome) {
        System.out.println("\"" + str + "\" is " + (isPalindrome ? "" : "not ") + "a palindrome.");
    }

    // Main method to orchestrate the flow
    public static void main(String[] args) {
        String input = inputString();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}
