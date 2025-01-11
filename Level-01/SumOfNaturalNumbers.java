import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
		
		//Making object of Scanner class for user input
        Scanner kb = new Scanner(System.in);

		//Taking natural no as user input 
        System.out.print("Enter a natural number (n): ");
        int n = kb.nextInt();

        // Checking if the input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a +ve natural number.");
        } else {
		
            // Calculating sum using formula
            int sumUsingFormula = n * (n + 1) / 2;

            // Calculate sum using while loop
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }

            // Comparing both of the results
            System.out.println("Sum calculated using the formula: " + sumUsingFormula);
            System.out.println("Sum calculated using the while loop: " + sum);

			//output results 
            if (sumUsingFormula == sum) {
                System.out.println("Both the results are correct!");
            } else {
                System.out.println("There is a difference in the results.");
            }
        }
    }
}
