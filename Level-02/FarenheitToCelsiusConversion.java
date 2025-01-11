import java.util.Scanner;

public class FarenheitToCelsiusConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//Taking temperature in fahrenheit as user input 
        System.out.println("Enter temp in fahrenheit : ");
        double fahrenheit = sc.nextDouble();

		//converting temperature into celsius
        double celsius = (fahrenheit -32) * 5 /9 ;

		//output statement 
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsius + " celsius ");
    }
}
