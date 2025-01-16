import java.util.Scanner;

public class CharacterFrequency3 {

    public static String[] findFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequencies = new int[text.length()];

        // Outer loop to calculate frequency of characters
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                frequencies[i] = 1;

                // Inner loop to compare characters
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequencies[i]++;
                        characters[j] = '0'; // Mark duplicate characters
                    }
                }
            }
        }

        // Create a result array
        String[] result = new String[text.length()];
        int index = 0;

        // Store non-duplicate characters with frequencies
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + ": " + frequencies[i];
            }
        }

        // Resize the array to fit result count
        String[] finalResult = new String[index];
        System.arraycopy(result, 0, finalResult, 0, index);

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = kb.nextLine();

        String[] result = findFrequency(input);

        System.out.println("Character frequencies:");
        for (String res : result) {
            System.out.println(res);
        }
        kb.close();
    }
}
