/**
 * Layang
 */
public class Layang extends BangunDatar{

    double d1,d2;
    
    @Override
    public double Luas() {
        double luas = (d1*d2)/2;
        return luas;
    }
    @Override
    public double Keliling() {
        double keliling = 2*(d1+d2);
        return keliling;
    }
}