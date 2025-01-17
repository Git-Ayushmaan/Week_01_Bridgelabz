import java.util.Scanner;

public class FactorialUsingRecursion {
    // Method to accept input for a number
    private static int inputNumber() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial: ");
        return kb.nextInt();
    }

    // Recursive method to calculate factorial
    private static long calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    // Method to display the factorial
    private static void outputResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Main method to integrate input, process, and output
    public static void main(String[] args) {
        int number = inputNumber();
        long factorial = calculateFactorial(number);
        outputResult(number, factorial);
    }
}
