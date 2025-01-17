public class BasicCalculator {
    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division with error handling
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Main method to accept inputs and perform calculations
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Select operation to perform:");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");

        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (choice) {
            case 1 -> {
                result = add(num1, num2);
                System.out.println("Result: " + result);
            }
            case 2 -> {
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
            }
            case 3 -> {
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
            }
            case 4 -> {
                try {
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            default -> System.out.println("Invalid choice! Please select a valid operation.");
        }

        scanner.close();
    }
}
