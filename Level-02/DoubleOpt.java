import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Taking value of a as user input
        System.out.println("Enter value a: ");
        double a = sc.nextDouble();
		
		
		//Taking value of b as user input
        System.out.println("Enter value b: ");
        double b = sc.nextDouble();

		//Taking value of c as user input
        System.out.println("Enter value c: ");
        double c = sc.nextDouble();


		//Calculating results based on different operations
        double firstResult = a + b * c;
        double secondResult = a * b +c;
        double thirdResult = c + a / b;
        double fourthResult = a % b + c;

		//output Statement
        System.out.println("The results of double opt are :" + firstResult + ","+secondResult + " and "+thirdResult + ", "+fourthResult );

    }
}
