import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Taking number as user input 
        System.out.print("Enter a number: ");
        int number = kb.nextInt();

        // Initializing sum and originalNumber variables
        int sum = 0;
        int originalNumber = number;

        // Using a while loop to process each digit of the number
        while (originalNumber != 0) {
            // Get the last digit using modulus operator and proceeding
            int digit = originalNumber % 10;
            
            // Cube the digit and add it to the sum
            sum += Math.pow(digit, 3);
            
            // Removing the last digit by dividing by 10
            originalNumber /= 10;
        }

        // Checking whether the sum of cubes equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
