import java.util.Scanner;

public class BonusOfEmployee {
    public static void main(String[] args) {
		
		////Making object of Scanner class for user input
        Scanner kb = new Scanner(System.in);

        //Taking Employee's salary as user input 
        System.out.println("Enter the employee's salary: ");
        double salary = kb.nextDouble();

        //Taking Employee's years of service as user input 
        System.out.println("Enter the employee's years of service: ");
        int ServiceYears = kb.nextInt();

        // Checking if years of service is more than 5
        if (ServiceYears > 5) {
            double bonus = 0.05 * salary; // calculating bonus of 5%
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}
