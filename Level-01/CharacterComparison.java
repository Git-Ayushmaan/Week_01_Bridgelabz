
import java.util.Scanner;

public class CharacterComparison {

    public static char[] getCharactersFromString(String input) {
        char[] chars = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            chars[i] = input.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userInput = scanner.next();

        char[] manualArray = getCharactersFromString(userInput);
        char[] builtInArray = userInput.toCharArray();

        boolean areEqual = compareCharArrays(manualArray, builtInArray);

        System.out.println("Manual method result: " + String.valueOf(manualArray));
        System.out.println("Built-in toCharArray() result: " + String.valueOf(builtInArray));
        System.out.println("Are both arrays equal? " + areEqual);
    }
}
