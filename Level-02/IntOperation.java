import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//Taking value of a as user input 
        System.out.println("Enter value a : ");
        int a = sc.nextInt();

		//Taking value of b as userc input 
        System.out.println("Enter value b : ");
        int b = sc.nextInt();
		
		//Taking value of c as user input
        System.out.println("Enter value c : ");
        int c = sc.nextInt();

		//Calculating different operation based results
        int firstResult = a + b * c;
        int secondResult = a * b +c;
        int thirdResult = c + a / b;
        int fourthResult = a % b + c;

		//output Statement 
        System.out.println("The results of int operations are :" + firstResult + ","+secondResult + " and "+thirdResult + ", "+fourthResult );

     }
}
