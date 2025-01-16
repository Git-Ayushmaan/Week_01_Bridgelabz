import java.util.Scanner;

public class VowelsAndConsonants2 {

    // Method to identify the type of character
    public static String isVowelOrConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to process the string and return results
    public static String[][] findVowelsAndConsonants(String input) {
        String[][] result = new String[input.length()][2];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = isVowelOrConsonant(ch);
        }
        return result;
    }

    // Method to display results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s%-15s%n", "Character", "Type");
        System.out.println("-----------------------");
        for (String[] row : results) {
            System.out.printf("%-10s%-15s%n", row[0], row[1]);
        }
    }

    // Main method to take input and display results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[][] results = findVowelsAndConsonants(input);
        displayResults(results);
    }
}
