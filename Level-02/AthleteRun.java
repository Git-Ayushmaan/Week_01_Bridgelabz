import java.util.Scanner;

public class AthleteRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Taking length of side 1 in meters as user input 
        System.out.println("Enter the side 1 length in meter : ");
        double side1 = sc.nextDouble();

		//Taking length of side 2 in meters as user input
        System.out.println("Enter the side 2 length in meter :  ");
        double side2 = sc.nextDouble();

		//Taling length of side 3 in meters as user input
        System.out.println("Enter the side 3 length in meter : ");
        double side3 = sc.nextDouble();


		//Calculating perimeter 
        double perimeter = side1 + side2 + side3;

		//Declaring total distance 
        double totalDistance = 5000;

		//Calculating total no of rounds 
        double rounds = totalDistance / perimeter;

		//Output statement
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");

    }
}
