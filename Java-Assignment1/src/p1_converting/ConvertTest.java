package p1_converting;

import java.util.Scanner;

public class ConvertTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to choose between temperature or mass conversion
        System.out.println("Enter '1' for weight converting, or '2' for temperature converting:");
        int choice = scanner.nextInt();

        if (choice == 1) { // If user chooses mass conversion
            // Ask for temperature value
            System.out.println("Enter a temperature value:");
            double temperatureValue = scanner.nextDouble();

            // Ask for mass conversion option
            System.out.println("Enter '1' for converting LB to KG, or '2' for converting KG to LB:");
            int massOption = scanner.nextInt();

            // Perform mass conversion based on user's choice
            if (massOption == 1) {
                double result = Convert.getMass(temperatureValue, 1);
                System.out.println(temperatureValue + " LB is " + result + " KG");
            } else if (massOption == 2) {
                double result = Convert.getMass(temperatureValue, 2);
                System.out.println(temperatureValue + " KG is " + result + " LB");
            } else {
                System.out.println("Invalid option! Only 1 or 2 is allowed.");
            }
        } else if (choice == 2) { // If user chooses temperature conversion
            // Ask for temperature value
            System.out.println("Enter a temperature value:");
            double temperatureValue = scanner.nextDouble();

            // Ask for temperature conversion option
            System.out.println("Enter '1' for converting Celsius to Fahrenheit, or '2' for converting Fahrenheit to Celsius:");
            int tempOption = scanner.nextInt();

            // Perform temperature conversion based on user's choice
            if (tempOption == 1) {
                double result = Convert.getTemperature(temperatureValue, 1);
                System.out.println(temperatureValue + "°C is " + result + "°F");
            } else if (tempOption == 2) {
                double result = Convert.getTemperature(temperatureValue, 2);
                System.out.println(temperatureValue + "°F is " + result + "°C");
            } else {
                System.out.println("Invalid option! Only 1 or 2 is allowed.");
            }
        } else {
            System.out.println("Invalid choice! Only 1 or 2 is allowed.");
        }

        scanner.close();
    }
}
