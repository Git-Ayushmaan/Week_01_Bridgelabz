import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking number as user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();


		// Defining maximum size of the array
        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0; 

        // Extracting digits from last and store them in the array
        while (number != 0) {
            int digit = number % 10; 
            digits[index] = digit; 
            index++;

            if (index == maxDigit) {
                break; // 
				} break if max digit is reached 

            number /= 10; 
        }

        // Declaring variables to store the largest and second-largest digits
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
