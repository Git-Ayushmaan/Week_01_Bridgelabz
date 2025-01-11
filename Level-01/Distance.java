import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
		
		//Taking distance in feets as input
        System.out.println("Provide distance in feets: ");
        double dist_feets = sc.nextDouble();
		
		//converting dist in yards 
        double dist_yards = dist_feets /3;
		//converting dist in miles 
        double dist_miles = dist_yards /1760;

		//output statement 
        System.out.println("Your Height in feets is " + dist_feets +" while in yards is " + dist_yards + " and miles is " + dist_miles  );
    }
}
