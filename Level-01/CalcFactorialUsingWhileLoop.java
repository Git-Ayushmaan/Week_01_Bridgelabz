import java.util.Scanner;

public class CalcFactorialUsingWhileLoop {
    public static void main(String[] args) {
	
		//Making object of Scanner class for user input
        Scanner kb = new Scanner(System.in);

		//Taking a positive integer as user input 
        System.out.print("Enter a positive integer: ");
        int number = kb.nextInt();

        // Checking whether the input is positive integer or not 
        if (number < 0) {
            System.out.println("Please enter a +ve integer.");
        } else {
            // Initializing factorial to one
            int factorial = 1;
            int i = 1;

            // Calculate factorial using while loop
            while (i <= number) {
                factorial *= i; // Multiply current number to the factorial
                i++; //and incrementing the counter
            }

            // output statement 
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
