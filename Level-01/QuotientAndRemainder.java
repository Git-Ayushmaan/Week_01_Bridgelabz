import java.util.Scanner;

public class QuotientAndRemainder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // Division operator for quotient
        int remainder = number % divisor;  // Modulus operator for remainder
        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = kb.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = kb.nextInt();

        if (divisor == 0) {
            System.out.println("Error! Division by zero is not allowed.");
        } else {
            int[] result = findRemainderAndQuotient(number, divisor);
            System.out.println("The quotient is: " + result[0]);
            System.out.println("The remainder is: " + result[1]);
        }

        kb.close();
    }
}
