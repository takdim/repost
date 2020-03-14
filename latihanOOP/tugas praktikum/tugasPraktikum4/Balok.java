/**
 * Balok
 */
public class Balok extends BangunanRuang{

    double p,l,t;

    @Override
    public double Volume() {
        double volume = p*l*t;
        return volume;
    }
    @Override
    public double LuasPermukaan() {
        double LP = 2*(p*l + l*t + p*t);
        return LP;
    }

}