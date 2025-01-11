import java.util.Scanner;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {
   
		//Defining scanner class object 
        Scanner sc = new Scanner(System.in);

		//Taking nos and operators as user input 
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String operation = sc.next();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Perform calculation with switch-case
        switch (operation) {
            case "+" -> System.out.println("Result: " + (first + second));
            case "-" -> System.out.println("Result: " + (first - second));
            case "*" -> System.out.println("Result: " + (first * second));
            case "/" -> System.out.println(second != 0 ? "Result: " + (first / second) : "Cannot divide by zero");
            default -> System.out.println("Invalid Operator");
        }
    }
}