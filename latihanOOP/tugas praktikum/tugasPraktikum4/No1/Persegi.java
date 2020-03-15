/**
 * Persegi
 */
public class Persegi  extends BangunDatar{
    double sisi;

    @Override
    public double Luas() {
        return sisi*sisi;
    }
    @Override
    public double Keliling() {
        return 4*sisi;
    }
    
}