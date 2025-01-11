	import java.util.Scanner;

	public class RangeMultiplicationTable {
		public static void main(String[] args) {
			Scanner kb = new Scanner(System.in);

			// Taking number between 6 to 9 as user input  
			System.out.println("Enter a number : ");
			int number = kb.nextInt();

			// Defining an array to store multiplication results
			int[] multiplicationResult = new int[4]; 

			// Calculating the multiplication table for 6 to 9
			for (int i = 0; i < 4; i++) {
				int resultSet = 6 + i; 
				multiplicationResult[i] = number * resultSet;
			}

			// Displaying the results
			System.out.println("Multiplication table of " + number + " from 6 to 9:");
			for (int i = 0; i < 4; i++) {
				int multiplier = 6 + i;
				System.out.println(number + " * " + resultSet + " = " + multiplicationResult[i]);
			}
		}
	}
