/**
 * CalculatorDistance
 */
public class CalculatorDistance extends Converter implements Distance{

    @Override
    public double metreToKilo(double value) {
        return value*(0.001);
    }

    @Override
    public double metreToMilli(double value) {
        return 1*1000;
    }

    @Override
    public double inchToMetre(double value) {
        return value*(0.0254);
    }

    @Override
    public void start() {
        System.out.println("Converter Distance is Start");

    }

    @Override
    public void stop() {
        System.out.println("Converter Distance is Terminated");

    }

    
}