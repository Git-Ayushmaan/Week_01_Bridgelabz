import java.util.Scanner;

public class CelsiusToFarenheitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Taking temperature in celsius as user input
        System.out.println("Enter temperature in celsius : ");
        double celsius = sc.nextDouble();

		//Calculating temperature in Farenheit
        double Farenheit = (celsius * 9/5) + 32;

		//Output statement
        System.out.println("The " + celsius + " celsius is " + Fahrenheit + " farenhiet ");
    }
}
