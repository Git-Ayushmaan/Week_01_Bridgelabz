import java.util.Scanner;

public class UserTravellingDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//Taking name as user input
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
		
		//Taking starting city name as user input 
        System.out.print("Enter your starting city : ");
        String fromcity = sc.nextLine();
		
		//Taking via city name as user input
        System.out.print("Enter your via city : ");
        String viacity = sc.nextLine();

		//Taking destination city as user input
        System.out.print("Enter your destination city : ");
        String tocity = sc.nextLine();

		//Taking distance of starting city to via city as user input
        System.out.print("Enter the distance from " + fromcity + " to " + viacity + " in miles: ");
        double fromToVia = sc.nextDouble();

		//Taking distance from via city to destination city as user input
        System.out.print("Enter the distance from " + viacity + " to " + tocity + " in miles: ");
        double viaToFinalCity = sc.nextDouble();

		//Taking total time taken in hours as user input 
        System.out.print("Enter the total time taken in hours: ");
        double timeTaken = sc.nextDouble();

		//calculating total distance 
        double totaldistance = fromToVia + viaToFinalCity;

		//calculating average speed
        double averageSpeed = totaldistance / timeTaken;

		//output statement 
        System.out.println("\n UserDetailsTravel ");
        System.out.println("Traveler: " + name);
        System.out.println("Route: " + fromcity + " -> " + viacity + " -> " + tocity);
        System.out.println("Distance from " + fromcity + " to " + viacity + ": " + fromToVia + " miles");
        System.out.println("Distance from " + viacity + " to " + tocity + ": " + viaToFinalCity + " miles");
        System.out.println("Total distance traveled: " + totaldistance + " miles");
        System.out.println("Time taken : " + timeTaken + " hours");
        System.out.println("Average speed : " + averageSpeed + " miles per hour");

    }
}
