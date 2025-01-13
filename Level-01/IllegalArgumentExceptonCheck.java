import java.util.Scanner;

public class IllegalArgumentExceptonCheck {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = kb.nextLine();

        // Call method to generate the exception
        generateException(userInput);

        // Call method to handle runtime exception
        handleRuntimeException(userInput);

        kb.close();
    }

    // Method to generate an exception
    private static void generateException(String input) {
        // This intentionally causes IllegalArgumentException
        String result = input.substring(5, 2); // It will throw an exception when start > end
        System.out.println("Result: " + result);
    }

    // Method to handle the exception
    private static void handleRuntimeException(String input) {
        try {
            String result = input.substring(5, 2);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }
}
