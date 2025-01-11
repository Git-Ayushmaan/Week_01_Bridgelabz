import java.util.Scanner;

public class CalSimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Taking principal amount as user input
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

		//Taking rate of Interest as user input
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
		
		//Taking time period in years as user input  
        System.out.print("Enter the time period (in years): ");
        double time = sc.nextDouble();

		//Caculating simple interest
        double SimpleInterest = (principal*rate*time) / 100;

		//Output statement 
        System.out.println("The simple interest is " + SimpleInterest + " for principal " + principal +" Rate of interest " + rate + " and Time " + time + " years.");


    }
}
