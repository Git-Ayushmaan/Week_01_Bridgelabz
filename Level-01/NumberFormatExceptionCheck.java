public class NumberFormatExceptionCheck {

    // Method to generate NumberFormatException by trying to parse invalid input
    public static void generateNumberFormatException() {
        String invalidNumber = "InvalidNumber123";
        int number = Integer.parseInt(invalidNumber);
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleNumberFormatException() {
        try {
            String invalidNumber = "InvalidNumber123";
            int number = Integer.parseInt(invalidNumber);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main method to call both the generate and handle methods
    public static void main(String[] args) {
        // Call the method to generate exception (for demonstration purposes)
        // Uncomment the line below to observe the unhandled exception
        // generateNumberFormatException();

        // Call the method to handle the exception
        handleNumberFormatException();
    }
}
