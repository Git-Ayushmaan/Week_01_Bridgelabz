import java.util.Scanner;

public class CalculatingWindChill {

    public static double calculateWindChill(double temperature, double windSpeed) {
        // Wind chill formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the temperature:");
        double temperature = kb.nextDouble();

        System.out.print("Enter the wind speed:");
        double windSpeed = kb.nextDouble();

        // Calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        System.out.println("The wind chill temperature is: " + windChill + "°F");

        kb.close();
    }
}
