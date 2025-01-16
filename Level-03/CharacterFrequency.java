import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter a string: ");
        String input = kb.nextLine();

        // Call the method to find character frequencies
        char[][] result = findCharacterFrequency(input);

        // Display the character frequencies
        System.out.println("Character frequencies:");
        for (char[] freq : result) {
            if (freq[1] > 0) {
                System.out.println(freq[0] + ": " + (int) freq[1]);
            }
        }
    }

    public static char[][] findCharacterFrequency(String text) {
        // Array to store the frequency of characters (ASCII size 256)
        int[] frequencies = new int[256];

        // Loop to calculate frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequencies[ch]++;
        }

        // Prepare a 2D array to store characters and their frequencies
        char[][] result = new char[256][2];
        for (int i = 0; i < 256; i++) {
            if (frequencies[i] > 0) {
                result[i][0] = (char) i;       // Store character
                result[i][1] = (char) frequencies[i]; // Store frequency
            }
        }

        return result;
    }
}
