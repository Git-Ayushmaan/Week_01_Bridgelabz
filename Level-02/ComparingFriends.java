import java.util.Scanner;

public class ComparingFriends {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Declaring arrays to store ages and heights
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking ages and heights as inputs 
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + friends[i] + ":");

            // Taking age as user input
            while (true) {
                System.out.print("Age: ");
                ages[i] = kb.nextInt();
                if (ages[i] > 0) break;
                System.out.println("Invalid age. Please enter a positive number.");
            }

            // Taking height as user input
            while (true) {
                System.out.print("Height (in cm): ");
                heights[i] = kb.nextDouble();
                if (heights[i] > 0) break;
                System.out.println("Invalid height. Please enter a positive number.");
            }
        }

        // Devlaring variables to find the youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Applying loop through the arrays
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Displaying the results
        System.out.println("\nResults:");
        System.out.println("Youngest Friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        kb.close();
    }
}
