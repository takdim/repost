/**
 * BelahKetupat
 */
public class BelahKetupat extends BangunDatar{

    double s,d1,d2;

    @Override
    public double Luas() {
        double luas = 4*s;
        return luas;
    }
    @Override
    public double Keliling() {
        double keliling = (d1*d2)/2;
        return keliling;
    }
}