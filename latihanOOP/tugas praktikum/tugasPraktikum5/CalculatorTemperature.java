/**
 * CalculatorTemperature
 */
public class CalculatorTemperature extends Converter implements Temperature {

    @Override
    public double celciusToFahrnheit(double value) {
        return ((9*value)/5) + 32;
    }

    @Override
    public double celciusToKelvin(double value) {
        return value + 273.5;
    }

    @Override
    public void start() {
        System.out.println("Converter Temperature is Start");

    }

    @Override
    public void stop() {
        System.out.println("Converter Temperature is Terminated");

    }

        
    
}