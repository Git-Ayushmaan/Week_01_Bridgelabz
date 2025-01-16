import java.util.Scanner;

public class SplitText {

    // Method to find the length of a string without using length()
    public static int getStringLength(String text) {
        int length = 0;
        try {
            while (text.charAt(length) != '\0') {
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // The exception marks the end of the string as no more valid indices are present.
        }
        return length;
    }

    // Method to split text into words without using the split() method
    public static String[] customSplit(String text) {
        int length = getStringLength(text);
        int spaceCount = 0;

        // Count the spaces to determine the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // We will have (spaceCount + 1) words
        String[] words = new String[spaceCount + 1];
        int[] spaceIndices = new int[spaceCount + 1];
        
        // Store indices of spaces
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndices[index++] = i;
            }
        }
        spaceIndices[index] = length;  // Add the end of the string as the last index

        // Extract words based on indices
        int start = 0;
        for (int i = 0; i <= spaceCount; i++) {
            words[i] = text.substring(start, spaceIndices[i]).trim();
            start = spaceIndices[i] + 1;
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    // Main method for user input and processing
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a sentence: ");
        String input = kb.nextLine();

        // Call custom split logic
        String[] customSplitResult = customSplit(input);

        // Call built-in split method
        String[] builtInSplitResult = input.split(" ");

        // Compare the results
        boolean isSame = compareStringArrays(customSplitResult, builtInSplitResult);

        // Display the results
        System.out.println("Custom split result: ");
        for (String word : customSplitResult) {
            System.out.println(word);
        }

        System.out.println("Built-in split result: ");
        for (String word : builtInSplitResult) {
            System.out.println(word);
        }

        System.out.println("Do both methods produce the same result? " + isSame);
    }
}
