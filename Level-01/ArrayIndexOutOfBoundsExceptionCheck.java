import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionCheck {

    private static void generateException(String[] names) {
        // This method attempts to access an invalid index, causing an ArrayIndexOutOfBoundsException
        System.out.println(names[names.length]); // Access index equal to the length (invalid)
    }

    private static void handleException(String[] names) {
        // This method demonstrates handling the exception with try-catch
        try {
            System.out.println(names[names.length]); // Access index equal to the length (invalid)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Call the method to generate the exception
        generateException(names);

        // Call the method to handle the exception
        handleException(names);
    }
}
