import java.util.Scanner;

public class TotalIncomeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Taking salary as user input 
        System.out.println("Enter salary : ");
        double salary = sc.nextDouble();

		//Taking Bonus as user input
        System.out.println("Enter bonus : ");
        double bonus = sc.nextDouble();

		//calculating Total income
        double TotalIncome = salary + bonus ;
		
		//output statement
        System.out.println("The salary is INR " + salary +" and bonus is INR "+ bonus + " Hence total Income is INR "+TotalIncome);
    }
}
