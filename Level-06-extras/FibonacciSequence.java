import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = kb.nextInt();
        generateFibonacci(terms);
    }

    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
