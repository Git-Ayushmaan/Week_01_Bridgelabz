import java.util.Scanner;

public class CalcFactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
		
		//Making object of Scanner class for user input
        System.out.print("Enter a positive integer: ");
        int num = kb.nextInt();

        // Checking if the input is a natural number
        if (number < 0) {
            System.out.println("Please enter a +ve integer.");
        } else {
		
            // Initializing factorial result
            int factorial = 1;

            // Calculating factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // output statement
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
