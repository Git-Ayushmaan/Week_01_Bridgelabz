import java.util.*;

public class CalculatingGrade {

    public static void main(String[] args) {
        // Creating a scanner object for user input
        Scanner kb = new Scanner(System.in);

        // Taking marks of Physics, Chemistry, and Maths as user input
        System.out.print("Enter marks for Physics: ");
        double physics = kb.nextDouble();
        
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = kb.nextDouble();
        
        System.out.print("Enter marks for Maths: ");
        double maths = kb.nextDouble();

        // Calculating total marks and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;

        //providing grade and remarks based on the percentage
        String grade = "";
        String remarks = "";

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Output statement
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
		}
}
