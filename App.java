import java.util.Scanner;

class UnitConverter {

    // Length Conversion
    public static double lengthConvert(double value, String fromUnit, String toUnit) {
        double result = 0;
        if (fromUnit.equals("meters") && toUnit.equals("kilometers")) {
            result = value / 1000;
        } else if (fromUnit.equals("kilometers") && toUnit.equals("meters")) {
            result = value * 1000;
        } else if (fromUnit.equals("feet") && toUnit.equals("inches")) {
            result = value * 12;
        } else if (fromUnit.equals("inches") && toUnit.equals("feet")) {
            result = value / 12;
        } else {
            System.out.println("Invalid length units!");
        }
        return result;
    }

    // Temperature Conversion
    public static double tempConvert(double value, String fromUnit, String toUnit) {
        double result = 0;
        if (fromUnit.equals("celsius") && toUnit.equals("fahrenheit")) {
            result = (value * 9/5) + 32;
        } else if (fromUnit.equals("fahrenheit") && toUnit.equals("celsius")) {
            result = (value - 32) * 5/9;
        } else {
            System.out.println("Invalid temperature units!");
        }
        return result;
    }

    // Weight Conversion
    public static double weightConvert(double value, String fromUnit, String toUnit) {
        double result = 0;
        if (fromUnit.equals("kilograms") && toUnit.equals("grams")) {
            result = value * 1000;
        } else if (fromUnit.equals("grams") && toUnit.equals("kilograms")) {
            result = value / 1000;
        } else if (fromUnit.equals("pounds") && toUnit.equals("ounces")) {
            result = value * 16;
        } else if (fromUnit.equals("ounces") && toUnit.equals("pounds")) {
            result = value / 16;
        } else {
            System.out.println("Invalid weight units!");
        }
        return result;
    }

    // Time conversion
    public static double timeConvert(double value, String fromUnit, String toUnit) {
        double result = 0;
        if (fromUnit.equals("hours") && toUnit.equals("minutes")) {
            result = value * 60;
        } else if (fromUnit.equals("minutes") && toUnit.equals("hours")) {
            result = value / 60;
        } else if (fromUnit.equals("minutes") && toUnit.equals("seconds")) {
            result = value * 60;
        } else if (fromUnit.equals("seconds") && toUnit.equals("minutes")) {
            result = value / 60;
        } else {
            System.out.println("Invalid time units!");
        }
        return result;
    }

    // Volume Conversion
    public static double volumeConvert(double value, String fromUnit, String toUnit) {
        double result = 0;
        if (fromUnit.equals("liters") && toUnit.equals("milliliters")) {
            result = value * 1000;
        } else if (fromUnit.equals("milliliters") && toUnit.equals("liters")) {
            result = value / 1000;
        } else if (fromUnit.equals("gallons") && toUnit.equals("liters")) {
            result = value * 3.785;
        } else if (fromUnit.equals("liters") && toUnit.equals("gallons")) {
            result = value / 3.785;
        } else {
            System.out.println("Invalid volume units!");
        }
        return result;
    }
}

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Unit Converter!");

        // Choose type of conversion
        System.out.println("Choose conversion type:");
        System.out.println("1. Length");
        System.out.println("2. Temperature");
        System.out.println("3. Weight");
        System.out.println("4. Time");
        System.out.println("5. Volume");
        int choice = scanner.nextInt();

        double value, result = 0;
        String fromUnit = "", toUnit = "";  // Initialize to empty strings

        switch (choice) {
            case 1:
                // Length Conversion
                System.out.println("Enter the value to convert:");
                value = scanner.nextDouble();
                System.out.println("Convert from (meters/kilometers/feet/inches):");
                fromUnit = scanner.next();
                System.out.println("Convert to (meters/kilometers/feet/inches):");
                toUnit = scanner.next();
                result = UnitConverter.lengthConvert(value, fromUnit, toUnit);
                break;

            case 2:
                // Temperature Conversion
                System.out.println("Enter the temperature to convert:");
                value = scanner.nextDouble();
                System.out.println("Convert from (celsius/fahrenheit):");
                fromUnit = scanner.next();
                System.out.println("Convert to (celsius/fahrenheit):");
                toUnit = scanner.next();
                result = UnitConverter.tempConvert(value, fromUnit, toUnit);
                break;

            case 3:
                // Weight conversion
                System.out.println("Enter the weight to convert:");
                value = scanner.nextDouble();
                System.out.println("Convert from (kilograms/grams/pounds/ounces):");
                fromUnit = scanner.next();
                System.out.println("Convert to (kilograms/grams/pounds/ounces):");
                toUnit = scanner.next();
                result = UnitConverter.weightConvert(value, fromUnit, toUnit);
                break;

            case 4:
                // Time conversion
                System.out.println("Enter the time to convert:");
                value = scanner.nextDouble();
                System.out.println("Convert from (hours/minutes/seconds):");
                fromUnit = scanner.next();
                System.out.println("Convert to (hours/minutes/seconds):");
                toUnit = scanner.next();
                result = UnitConverter.timeConvert(value, fromUnit, toUnit);
                break;

            case 5:
                // Volume conversion
                System.out.println("Enter the volume to convert:");
                value = scanner.nextDouble();
                System.out.println("Convert from (liters/milliliters/gallons):");
                fromUnit = scanner.next();
                System.out.println("Convert to (liters/milliliters/gallons):");
                toUnit = scanner.next();
                result = UnitConverter.volumeConvert(value, fromUnit, toUnit);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        // Now it print the result only if the result is valid.
        if (result != 0 && !toUnit.equals("")) {
            System.out.println("Converted Value: " + result + " " + toUnit);
        }

        scanner.close();
    }
}