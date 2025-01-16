public class PalindromeText {

    // Logic 1: Iterative method
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character array
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = new char[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = text.charAt(originalArray.length - 1 - i);
        }
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        String text = "racecar"; // Example text to test

        // Use the three logic methods to check if it's a palindrome
        boolean resultIterative = isPalindromeIterative(text);
        System.out.println("Is Palindrome (Iterative): " + resultIterative);

        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Is Palindrome (Recursive): " + resultRecursive);

        boolean resultCharArray = isPalindromeUsingCharArray(text);
        System.out.println("Is Palindrome (Using CharArray): " + resultCharArray);
    }
}
