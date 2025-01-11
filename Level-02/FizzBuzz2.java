import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number as user input 
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Ensure the input is a positive integer
        if (number > 0) {
            int i = 1;
            // Loop from 1 to the given number
            while (i <= number) {
                // Checking for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
}
