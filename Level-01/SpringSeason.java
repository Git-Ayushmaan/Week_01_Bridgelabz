import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking month and day as user
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = sc.nextInt();

        // Checking if it is a Spring Season
        boolean isSpringSeason = 
            (month == 3 && day >= 20 && day <= 31) ||  // March 20 to 31
            (month == 4 && day >= 1 && day <= 30) ||   // April 1 to 30
            (month == 5 && day >= 1 && day <= 31) ||   // May 1 to 31
            (month == 6 && day >= 1 && day <= 20);     // June 1 to 20

        // Output result
        if (isSpringSeason) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
