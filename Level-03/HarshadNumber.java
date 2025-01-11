import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Taking number as user input 
        System.out.print("Enter a number: ");
        int number = kb.nextInt();

        // Initializing variables
        int sum = 0;
        int originalNumber = number;

        // Using loop to calculate the sum of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10; 
            sum += digit; 
            originalNumber /= 10;
        }

        //Checking if the number is divisible by sum
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        scanner.close();
    }
}
