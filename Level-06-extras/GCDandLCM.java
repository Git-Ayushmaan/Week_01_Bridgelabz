import java.util.Scanner;

public class GCDandLCM {

    // Method to calculate GCD of two numbers using the Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Main method to take input and display GCD and LCM
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = kb.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = kb.nextInt();

        int gcdResult = gcd(num1, num2);
        int lcmResult = lcm(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmResult);
    }
}
