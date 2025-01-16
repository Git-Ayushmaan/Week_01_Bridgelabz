
import java.util.Scanner;

public class FindLength{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = kb.next();

        // Calling the custom method and built-in length() method
        int customLength = findStringLength(input);
        int builtInLength = input.length();

        // Display the output
        System.out.println("Custom length computation: " + customLength);
        System.out.println("Built-in length computation: " + builtInLength);
    }

    // Method to find the length of the string without using length()
    public static int findStringLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;                       }
        } catch (IndexOutOfBoundsException e) {
                    }

        return count;
    }
}
