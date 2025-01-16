import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate a 1D array of random two-digit ages for 'n' students
    public static int[] generateRandomAges(int n) {
        Random rm = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + rm.nextInt(90); // Random age between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility based on an age array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) { // Negative age validation
                results[i][1] = "false";
            } else if (ages[i] >= 18) { // Voting eligibility check
                results[i][1] = "true";
            } else {
                results[i][1] = "false";
            }
        }
        return results;
    }

    // Method to display 2D array results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Age\tCan Vote");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generating random ages
        int[] ages = generateRandomAges(numberOfStudents);

        // Checking voting eligibility
        String[][] results = checkVotingEligibility(ages);

        // Displaying results
        displayResults(results);
    }
}
