import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        
        // Perform date arithmetic
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = modifiedDate.minusWeeks(3);

        // Print results
        System.out.println("After adding 7 days, 1 month, and 2 years: " + modifiedDate);
        System.out.println("After subtracting 3 weeks: " + finalDate);
    }
}
