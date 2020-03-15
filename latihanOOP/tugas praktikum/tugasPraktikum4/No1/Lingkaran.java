/**
 * Lingkaran
 */
public class Lingkaran extends BangunDatar{

    double r;

    @Override
    public double Luas() {
        double luas = 3.14*r*r;
        return luas;
    }

    @Override
    public double Keliling() {
        double keliling = 2*3.14*r*r;
        return keliling;
    }
}