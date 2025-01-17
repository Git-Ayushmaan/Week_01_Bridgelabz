import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int low = 1;
        int high = 100;
        boolean correct = false;

        System.out.println("Think of a number between 1 and 100, and the computer will try to guess it!");

        while (!correct) {
            int guess = generateRandomGuess(low, high, random);
            System.out.println("Computer guesses: " + guess);
            System.out.println("Is the guess (H)igh, (L)ow, or (C)orrect?");

            String feedback = scanner.nextLine().trim().toUpperCase();
            switch (feedback) {
                case "H":
                    high = guess - 1;
                    break;
                case "L":
                    low = guess + 1;
                    break;
                case "C":
                    System.out.println("The computer guessed your number!");
                    correct = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter H, L, or C.");
            }
        }

        scanner.close();
    }

    private static int generateRandomGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }
}
