import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
		
		//Making object of Scanner class for user input
        System.out.print("Enter a +ve integer: ");
        int number = kb.nextInt();

        // Checking if the input is a natural number
        if (number <= 0) {
            System.out.println("Please enter a +ve integer.");
        } else {
            System.out.println("Odd and Even numbers from 1 to " + num + ":");

            // Iterating from 1 to the given number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number.");
                } else {
                    System.out.println(i + " is an Odd number.");
                }
            }
        }
    }
}
