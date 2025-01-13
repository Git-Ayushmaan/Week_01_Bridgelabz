public class StringIndexOutOfBoundsCheck {

    public static void main(String[] args) {
        System.out.println("Calling generateException() to demonstrate the exception:");
        generateException();

        System.out.println("\nCalling handleException() to handle the exception gracefully:");
        handleException();
    }

    public static void generateException() {
        String str = "Hello, World!";
        // Attempt to access an index beyond the string length
        System.out.println("Character at index 20: " + str.charAt(20));
    }

    public static void handleException() {
        String str = "Hello, World!";
        try {
            // Attempt to access an index beyond the string length
            System.out.println("Character at index 20: " + str.charAt(20));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
