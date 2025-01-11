import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//declaring cm as a varaiable
        double cms;
		
		//Taking height as an input in cms
        System.out.println("Enter Height in cms:");
        cms = sc.nextDouble();
        double inches;
        double feets;
		
		//converting height into inches and feets
        inches = cms /2.54;
        feets = inches /12;
		
		//output Statement
        System.out.println(" Your Height in cm is "+cms + " while in feet is " + feets + " and inches is " + inches);


    }
}
