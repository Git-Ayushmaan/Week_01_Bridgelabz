import java.util.Scanner;

public class BonusOfEmployee {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Decalring Arrays to store salary, years of service, bonus, and new salary
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Declaring variables and initiating them with 0 for further calculation
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        // loop for taking employee details as user input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            // Taking salary as user input
            while (true) {
                System.out.print("Salary: ");
                salary[i] = kb.nextDouble();
                if (salary[i] > 0) break;
                System.out.println("Invalid salary, Please enter a positive number.");
            }

            // Taking years of service as user input 
            while (true) {
                System.out.print("Years of Service: ");
                yearsOfService[i] = kb.nextDouble();
                if (yearsOfService[i] >= 0) break;
                System.out.println("Invalid years of service, Please enter a non-negative number.");
            }
        }

        // Calculating bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }
            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Output statement
        System.out.println("\nEmployee Details with Bonus:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d - Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f%n",
                              i + 1, salary[i], bonus[i], newSalary[i]);
          
        }

        System.out.printf("\nTotal Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        kb.close();
    }
}
