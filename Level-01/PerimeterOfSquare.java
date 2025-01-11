import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//Taking perimeter of square as user input 
        System.out.println("Provide the perimeter of the Square");
        double perimeter = sc.nextDouble();
		
		//calculating side 
        double side = perimeter/4;
		
		//output statement 
        System.out.println("The length of the side is "+ side + " whose perimeter is " + perimeter);
    }
}
