import java.util.Scanner;

public class RemainderAndQuotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		
		//Taking first number as user input  
        System.out.println("Enter number1 :  " );
        int number1 = sc.nextInt();

		//Taking second number as input
        System.out.println("Enter number2 : ");
        int number2 = sc.nextInt();

		//calculating quotient and remainder 
        int quotient = number1 / number2;
        int remainder = number1 % number2;

		//output Statement 
        System.out.println("The Quotient is " + quotient +"and Remainder is " + remainder +"of two number "+number1 + "and "+number2);

    }
}
