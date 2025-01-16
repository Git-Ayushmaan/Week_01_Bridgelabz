import java.util.Scanner;

public class NonRepeatingCharacters {

    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; // Return null char if no non-repeating character is found
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = kb.nextLine();

        char result = findFirstNonRepeatingChar(input);
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        kb.close();
    }
}
