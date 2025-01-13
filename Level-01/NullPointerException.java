class NullPointerDemo {

    public static void generateException() {
        String text = null;
        // This will throw a NullPointerException
        text.length();
    }

    public static void handleException() {
        String text = null;
        try {
            // Attempt to call a method on a null String
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call the method that generates the exception
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
        
        // Refactored to call the exception-handling method
        handleException();
    }
}
