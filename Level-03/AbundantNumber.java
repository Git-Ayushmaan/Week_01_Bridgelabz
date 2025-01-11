import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //Taking number as input 
        System.out.print("Enter a number: ");
        int number = kb.nextInt();

        // Initializing the sum variable
        int sum = 0;

        // Calculating the sum of all divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if 'i' is a divisor
                sum += i; // Add the divisor to the sum
            }
        }

        // Checking if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        scanner.close();
    }
}
