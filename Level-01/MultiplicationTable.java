import java.util.Scanner;

public class 	 {
    public static void main(String[] args) {
		
		//Making object of Scanner class for user input
        Scanner kb = new Scanner(System.in);

        // Taking no for which the multiplication table is to be generated as user input 
        System.out.print("Enter an integer: ");
        int number = kb.nextInt();

        // calculating for multiplication table from 6 to 9
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
