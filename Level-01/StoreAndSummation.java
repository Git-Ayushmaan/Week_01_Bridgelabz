import java.util.Scanner;

public class StoreAndSummation {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Declaring an array of 10 elements and initializing variables
        double[] array = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 positive numbers, Enter 0 or a negative number to stop:");

        // Applying while loop 
        while (true) {
            System.out.println("Enter a number: ");
            double number = kb.nextDouble();

            // Breaking the loop if input is 0, negative, or if array is full
            if (number <= 0 || index == 10) {
                break;
            }

            // Storing the value in the array and incrementing the index
            array[index] = number;
            index++;
        }

        // Calculating the total sum of the entered numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(array[i]);
            total += array[i];
        }

        // Displaying the total sum
        System.out.println("Sum of all numbers: " + total);
    }
}
