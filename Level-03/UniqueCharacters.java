import java.util.Scanner;

public class UniqueCharacters {

    // Method to calculate the length of a string without using length() method
    public static int calculateLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string
        }
        return length;
    }

    // Method to find unique characters in a string and return them as an array
    public static char[] findUniqueCharacters(String text) {
        int length = calculateLength(text);
        char[] uniqueChars = new char[length];
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if this character is unique
            for (int j = 0; j < uniqueIndex; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // Add to uniqueChars array if unique
            if (isUnique) {
                uniqueChars[uniqueIndex] = currentChar;
                uniqueIndex++;
            }
        }

        // Create a final trimmed array with only unique characters
        char[] result = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }

    // Main method for user input and displaying results
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = kb.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(input);

        // Display result
        System.out.println("Unique characters in the string are:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
}
