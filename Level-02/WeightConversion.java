import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Taking weight in pounds as user input 
        System.out.print("Enter weight in pounds: ");
        double WeightInPounds = sc.nextDouble();

		//Calculating weight in kg
        double WeightInKg = WeightInPounds * 2.2;

		//output statement
        System.out.println("The weight of the person in pounds is " + WeightInPounds + " and in kg is " + WeightInKg);

    }
}
