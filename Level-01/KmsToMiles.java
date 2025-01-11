import java.util.Scanner;

public class KmsToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//declaring kms and miles as variables 
        double kms;
        double miles;
		
		//Taking no of kilometers as user input
        System.out.println("Enter no of Kilometers :");
        kms = sc.nextDouble();
		
		//calculating no of miles 
        miles = kms * 1.6;
		
		//output statement 
        System.out.println("The total miles is " + miles + "mile for the given " + kms + "km");
    }
}
