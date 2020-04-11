/**
 * CalculatorData
 */
public class CalculatorData extends Converter implements Data {

    @Override
    public long teraToGiga(long value) {
        return value*1024;
    }

    @Override
    public long teraToMega(long value) {
        return value*(1024*1024);
    }

    @Override
    public long teraToKilo(long value) {
        return value*(1024*1024*1024);
    }

    @Override
    public void start() {
        System.out.println("Converter Data is Start");
    }

    @Override
    public void stop() {
        System.out.println("Converter Data is Terminated");
    }

    
}