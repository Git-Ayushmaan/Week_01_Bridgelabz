
public class ReverseString {

    public static String reverseString(String input) {
        char[] characters = input.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = characters.length - 1; i >= 0; i--) {
            reversed.append(characters[i]);
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
}
