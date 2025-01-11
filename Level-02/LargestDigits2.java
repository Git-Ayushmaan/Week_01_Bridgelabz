import java.util.Scanner;
import java.util.Arrays;

public class LargestDigits2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking number as user input 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10; 
        int[] digits = new int[maxDigit]; 
        int index = 0; 

        // Extracting digits and storing them in the array
        while (number != 0) {
            int digit = number % 10;  
            digits[index] = digit; 
            index++;

            if (index == maxDigit) {
                maxDigit += 10; // Increasing the size of maxDigit
                digits = Arrays.copyOf(digits, maxDigit); // Copy the array into a larger array
            }

            number /= 10; // Remove the last digit from the number
        }

        //Declaring variables to store the largest and second-largest digits
        int largest = 0, secondLargest = 0;

        // Applying loop through the array to find the largest and second-largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Updating second largest
                largest = digits[i];    // Updating largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Displaying the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
