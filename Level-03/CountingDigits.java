import java.util.Scanner;

public class CountingDigits {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Taking number as user Input
        System.out.print("Enter an integer: ");
        int number = kb.nextInt();

        // Initializing counting  variable
        int count = 0;

        // Handling case for 0 explicitly
        if (number == 0) {
            count = 1;
        } else {
            // Use a loop to count the digits
            while (number != 0) {
                // Removing the last digit
                number /= 10;
                // Incrementing the count
                count++;
            }
        }

        // Displaying the count
        System.out.println("The number of digits is: " + count);

        scanner.close();
    }
}
