import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        boolean ans = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            ans = true;
        }
        return ans;
    }
}