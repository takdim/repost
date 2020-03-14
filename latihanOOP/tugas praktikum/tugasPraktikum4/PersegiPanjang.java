/**
 * PersegiPanjang
 */
public class PersegiPanjang extends BangunDatar{

    double p,l;

    @Override
    public double Luas() {
        double luas = p*l;
        return luas;
    }
    @Override
    public double Keliling() {
        double keliling = 2* (p+l);
        return keliling;
    }
}