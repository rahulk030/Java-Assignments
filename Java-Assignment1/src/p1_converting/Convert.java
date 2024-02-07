package p1_converting;

public class Convert {
    // Define two static class fields/variables for storing results
    private static double massResult;
    private static double tempResult;

    // Method to convert pounds to kilograms
    private static double getKilogramValue(double poundValue) {
        // Conversion formula: 1 pound = 0.45359237 kilograms
        return poundValue * 0.45359237;
    }

    // Method to convert kilograms to pounds
    private static double getPoundValue(double kilogramValue) {
        // Conversion formula: 1 kilogram = 2.20462262 pounds
        return kilogramValue * 2.20462262;
    }

    // Method to convert Celsius to Fahrenheit
    private static double getFahrenheitValue(double celsiusValue) {
        // Conversion formula: °F = (°C * 9/5) + 32
        return (celsiusValue * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    private static double getCelsiusValue(double fahrenheitValue) {
        // Conversion formula: °C = (°F - 32) * 5/9
        return (fahrenheitValue - 32) * 5 / 9;
    }

    // Method to convert temperature based on user choice
    public static double getTemperature(double value, int choice) {
        // Check user choice
        if (choice == 1) {
            // Convert Celsius to Fahrenheit if choice is 1
            tempResult = getFahrenheitValue(value);
        } else if (choice == 2) {
            // Convert Fahrenheit to Celsius if choice is 2
            tempResult = getCelsiusValue(value);
        } else {
            // Display error message for invalid choice
            System.err.println("Invalid Choice! Only 1 or 2 is allowed");
            // Set result to 0 if choice is invalid
            tempResult = 0;
        }
        // Return the converted temperature value
        return tempResult;
    }

    // Method to convert mass based on user choice
    public static double getMass(double value, int choice) {
        // Check user choice
        if (choice == 1) {
            // Convert pounds to kilograms if choice is 1
            massResult = getKilogramValue(value);
        } else if (choice == 2) {
            // Convert kilograms to pounds if choice is 2
            massResult = getPoundValue(value);
        } else {
            // Display error message for invalid choice
            System.err.println("Invalid Choice! Only 1 or 2 is allowed");
            // Set result to 0 if choice is invalid
            massResult = 0;
        }
        // Return the converted mass value
        return massResult;
    }
}
