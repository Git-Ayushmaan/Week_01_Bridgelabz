public class ToggleCase {

    public static String toggleCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // Keep non-alphabetical characters as they are
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        String toggled = toggleCase(input);
        System.out.println("Original: " + input);
        System.out.println("Toggled: " + toggled);
    }
}
