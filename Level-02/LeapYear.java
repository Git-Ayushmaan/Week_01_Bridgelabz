import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
		//Taking object of scanner class for user input  
        Scanner kb = new Scanner(System.in);

        // Taking yeart as user input
        System.out.print("Enter year: ");
        int year = kb.nextInt();

        // Checking if year is greater than or equal to 1582
        if (year >= 1582) {
            // Checking leap year using multiple if-else statements
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year should be greater than or equal to 1582 (Gregorian calendar).");
        }
    }
}
