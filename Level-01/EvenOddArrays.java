import java.util.Scanner;

public class EvenOddArrays {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Get the input from the user
        System.out.print("Enter a number: ");
        int number = kb.nextInt();

        // Checking whether the entered number is a natural number greater than 0
        if (number <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return;  
        }

        // Define arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // Define index variables for odd and even arrays
        int oddIndex = 0, evenIndex = 0;

        // Loop through numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;  // Store even numbers
            } else {
                oddNumbers[oddIndex++] = i;  // Store odd numbers
            }
        }

        // Printing the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Printing the even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
    }
}
