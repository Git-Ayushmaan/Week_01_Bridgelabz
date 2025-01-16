import java.util.Scanner;

public class CharacterFrequency2 {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        StringBuilder unique = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (unique.indexOf(String.valueOf(currentChar)) == -1) {
                unique.append(currentChar);
            }
        }
        return unique.toString().toCharArray();
    }

    // Method to compute the frequency of characters
    public static String[][] characterFrequency(String text) {
        int[] charFrequency = new int[256]; // ASCII size
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }
        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(charFrequency[uniqueChars[i]]);
        }
        return result;
    }

    // Main method to test the program
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = kb.nextLine();

        String[][] frequencies = characterFrequency(input);

        System.out.println("Character frequencies:");
        for (String[] row : frequencies) {
            System.out.println(row[0] + ": " + row[1]);
        }

        kb.close();
    }
}
