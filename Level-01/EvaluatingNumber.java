import java.util.Scanner;

public class EvaluatingNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Defining an array to store 5 numbers
        int[] array = new int[5];

        // Taking number as user input 
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            array[i] = kb.nextInt();
        }

        // Traversing through each number
        for (int i = 0; i < array.length; i++) {
            int number = array[i];

            if (number > 0){
                if (number % 2 == 0) {
                    System.out.println("Number " + number + " is positive and even.");
                } else {
                    System.out.println("Number " + number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println("Number " + number + " is negative.");
            } else {
                System.out.println("Number " + number + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        int first = array[0];
        int last = array[array.length - 1];

        System.out.println("\nComparison between the first and last elements:");
        if (first == last) {
            System.out.println("The first (" + first + ") and last (" + last + ") elements are equal.");
        } else if (first > last) {
            System.out.println("The first element (" + first + ") is greater than the last element (" + last + ").");
        } else {
            System.out.println("The first element (" + first + ") is less than the last element (" + last + ").");
        }
    }
}
