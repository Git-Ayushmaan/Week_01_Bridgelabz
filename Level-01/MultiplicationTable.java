import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Taking no as user input
        System.out.print("Enter a number to print its multiplication table: ");
        int number = kb.nextInt();

        // Defining an array to store the multiplication table
        int[] multiplicationTable = new int[10];

        // Calculate the multiplication table
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Displaying the multiplication table
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }
    }
}
