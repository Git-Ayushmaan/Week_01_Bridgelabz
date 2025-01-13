import java.util.Scanner;

public class HandshakeCalc {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = kb.nextInt();

        if (n < 2) {
            System.out.println("Less than 2 students .");
        } else {
            int handshakes = calculateHandshakes(n);
            System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);
        }

        kb.close
		}
	}
