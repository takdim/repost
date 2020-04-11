/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        CalculatorData cData = new CalculatorData();
        cData.start();
        if (cData.teraToGiga(9) == 9216) {
            System.out.println("Terabyte To Gigabyte = OK");
            if (cData.teraToMega(16) == 16777216) {
                System.out.println("Terabyte To Megabyte = OK");
                if (cData.teraToKilo(1) == 1073741824) {
                    System.out.println("Terabyte To Kilobyte = OK");
                } else {
                    System.out.println("Terabyte To Kilobyte = INCORRECT");
                    return;
                }
            } else {
                System.out.println("Terabyte To Megabyte = INCORRECT");
                return;
            }
        } else {
            System.out.println("Terabyte To Gigabyte = INCORRECT");
            return;
        }
        cData.stop();
        System.out.println("\n");

        CalculatorTemperature cTemp = new CalculatorTemperature();
        cTemp.start();
        if (cTemp.celciusToFahrnheit(9) == 48.2) {
            System.out.println("Celcius to Fahrenheit = OK");
            if (cTemp.celciusToKelvin(11) == 284.15) {
                System.out.println("Celcius to Kelvin = OK");
            } else {
                System.out.println("Celcius to Kelvin = INCORRECT");
                return;
            }
        } else {
            System.out.println("Celcius to Fahrenheit = INCORRECT");
            return;
        }
        cTemp.stop();
        System.out.println("\n");

        CalculatorDistance cDistance = new CalculatorDistance();
        cDistance.start();
        if (cDistance.inchToMetre(1) == 0.0254) {
            System.out.println("Inch to Metre = OK");
            if (cDistance.metreToKilo(12500) == 12.5) {
                System.out.println("Metre to Kilometre = OK");
                if (cDistance.metreToMilli(12.9) == 12900) {
                    System.out.println("Metre to Millimetre = OK");
                } else {
                    System.out.println("Metre to Millimetre = INCORRECT");
                    return;
                }
            } else {
                System.out.println("Metre to Kilometre = INCORRECT");
                return;
            }
        } else {
            System.out.println("Inch to Metre = INCORRECT");
            return;
        }
        cDistance.stop();
        System.out.println("\n");
    }
}