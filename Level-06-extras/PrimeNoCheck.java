public class PrimeNoCheck {

    public static void main(String[] args) {
        int number = 29; // Example number
        System.out.println(number + " is prime: " + isPrime(number));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
