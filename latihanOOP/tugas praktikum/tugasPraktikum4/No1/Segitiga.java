/**
 * Segitiga
 */
public class Segitiga extends BangunDatar{

    double a,t,s;

    @Override
    public double Luas() {
        double luas = (a*t)/2;
        return luas;
    }
    @Override
    public double Keliling() {
        double keliling = a+t+s;
        return keliling;
    }
}