import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base_cm;
		
		//Taking base a s user input
        System.out.println("Enter base in cms:");
        base_cm = sc.nextDouble();
        double height_cm;
		
		//Taking height as user input
        System.out.println("Enter Height in cms");
        height_cm = sc.nextDouble();
		
		//Calculating area in square cms and inches
        double areaIncmSquare = 0.5 * base_cm * height_cm;
        double areaInInchesSquare = 0.5 * (base_cm*0.393701) * (height_cm*0.393701);
		
		//Printing output 
		System.out.println("Area of Triangle in square cms is : "+ areaIncmSquare);
        System.out.println("Area of Triangle in square inches is : "+ areaInInchesSquare);
		
		
		//Converting height into inches and feets
        double height_Inches = height_cm/2.54;
        double height_Feets = height_Inches/12;

		//output statement
        System.out.println("Height in cm is "+ height_cm+ " " + " while in feet is " + height_Feets + " and inches is " + height_Inches);
    }
}
