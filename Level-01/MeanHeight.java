import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Declaring an array of size 11 to store the heights of the players
        double[] heights = new double[11];
        double sum = 0.0;

        // Taking heights of the players as user input
        System.out.println("Enter the heights of 11 players in the football team:");

        for (int i = 0; i < 11; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = kb.nextDouble();
            sum += heights[i];  // 
        }

        // Calculating the mean height
        double mean = sum / 11;

        // Displaying the mean height
        System.out.println("\nThe mean height of the football team is: " + mean);
    }
}
