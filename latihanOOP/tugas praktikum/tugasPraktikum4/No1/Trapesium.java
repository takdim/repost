/**
 * Trapesium
 */
public class Trapesium extends BangunDatar{

    double a,t,b,c;

    @Override
    public double Luas() {
        double luas = a*t;
        return luas;
    }
    @Override
    public double Keliling() {
        double keliling = a+b+c+t;
        return keliling;
    }
    
}