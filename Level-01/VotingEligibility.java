import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Defining an array to store ages of 10 students
        int[] array = new int[10];

        // Taking ages of 10 students as user input
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            array[i] = kb.nextInt();
        }

        // Check voting eligibility for each age
        for (int i = 0; i < ages.length; i++) {
            int age = array[i];

            if (age < 0) {
                System.out.println("Invalid age for student " + (i + 1) + ": " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
    }
}
