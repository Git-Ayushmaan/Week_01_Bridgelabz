import java.util.Scanner;

public class SumOfNaturalNosUsingForLoop {
    public static void main(String[] args) {
	
		//Making object of Scanner class for user input	
        Scanner kb = new Scanner(System.in);

		//Taking number as user input 
        System.out.print("Enter a natural number : ");
        int n = kb.nextInt();

        // Checking whether the no is natural no or not 
        if (n <= 0) {
            System.out.println("Please enter a +ve natural number.");
        } else {
            // Calculating sum using formula
            int sumUsingFormula = n * (n + 1) / 2;

            // Calculating sum using for loop
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
			
            // Comparing both of the results
            System.out.println("Sum calculated using the formula: " + sumUsingFormula);
            System.out.println("Sum calculated using the For loop: " + sum);

			//output results 
            if (sumUsingFormula == sum) {
                System.out.println("Both the results are correct!");
            } else {
                System.out.println("There is a difference in the results.");
            }
        }
    }
}

          