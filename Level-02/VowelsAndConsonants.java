public class VowelsAndConsonants {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String isVowelOrConsonant(char c) {
        c = Character.toLowerCase(c); // Convert to lowercase
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel"; // Check for vowels
            } else {
                return "Consonant"; // If not a vowel, it's a consonant
            }
        } else {
            return "Not a Letter"; // Check for non-alphabetic characters
        }
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            String result = isVowelOrConsonant(str.charAt(i));
            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants}; // Return counts as an array
    }

    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        
        // Taking user input
        System.out.println("Enter a string:");
        String input = kb.nextLine();
        
        // Count vowels and consonants
        int[] result = countVowelsAndConsonants(input);

        // Display results
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        kb.close(); // Close the scanner
    }
}
