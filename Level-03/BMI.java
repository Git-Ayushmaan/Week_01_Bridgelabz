import java.util.Scanner;

public class BMI {

    private static final int TEAM_SIZE = 10;

    public static void main(String[] args) {
        double[][] persons = new double[TEAM_SIZE][2];
        Scanner kb = new Scanner(System.in);

        // Input height and weight
        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.printf("Enter weight (kg) for person %d: ", i + 1);
            persons[i][0] = kb.nextDouble();
            System.out.printf("Enter height (cm) for person %d: ", i + 1);
            persons[i][1] = kb.nextDouble();
        }

        // Compute BMI and status
        String[][] results = computeBMIAndStatus(persons);

        // Display results
        displayResults(results);

        kb.close();
    }

    private static String[][] computeBMIAndStatus(double[][] persons) {
        String[][] results = new String[TEAM_SIZE][4];

        for (int i = 0; i < persons.length; i++) {
            double weight = persons[i][0];
            double heightInMeters = persons[i][1] / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);
            String status;

            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            results[i][0] = String.format("%.2f", weight);
            results[i][1] = String.format("%.2f", heightInMeters * 100);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }

        return results;
    }

    private static void displayResults(String[][] results) {
        System.out.printf("%-10s%-10s%-10s%-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");

        for (String[] result : results) {
            System.out.printf("%-10s%-10s%-10s%-15s%n", result[0], result[1], result[2], result[3]);
        }
    }
}
