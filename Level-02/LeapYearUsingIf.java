import java.util.Scanner;

public class LeapYearUsingIf {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Taking year as user input
        System.out.print("Enter a year: ");
        int year = kb.nextInt();

        // Checking if year is greater than or equal to 1582
        if (year >= 1582) {
            // Checking leap year with a single if statement and using multiple logics 
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year should be greater than or equal to 1582 (Gregorian calendar).");
        }
    }
}
