public class TrimSpaces {

    public static String trimSpacesUsingCharAt(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start <= end && input.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && input.charAt(end) == ' ') {
            end--;
        }

        return substringUsingCharAt(input, start, end + 1);
    }

    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "   Hello World!   ";

        // Trim using custom method
        String trimmedCustom = trimSpacesUsingCharAt(input);

        // Trim using built-in method
        String trimmedBuiltIn = input.trim();

        // Compare results
        boolean comparisonResult = compareStringsUsingCharAt(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("Original String: \"" + input + "\"");
        System.out.println("Trimmed using custom method: \"" + trimmedCustom + "\"");
        System.out.println("Trimmed using built-in method: \"" + trimmedBuiltIn + "\"");
        System.out.println("Comparison result: " + comparisonResult);
    }
}
