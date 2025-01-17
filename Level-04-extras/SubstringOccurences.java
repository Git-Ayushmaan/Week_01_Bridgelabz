public class SubstringOccurences {

    public static int countSubstringOccurrences(String input, String substring) {
        int count = 0;
        int index = 0;

        while ((index = input.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "ababcabcab";
        String substring = "abc";

        int occurrences = countSubstringOccurrences(input, substring);
        System.out.println("The substring '" + substring + "' occurs " + occurrences + " times in the string.");
    }
}
