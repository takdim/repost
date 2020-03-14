/**
 * Kerucut
 */
public class Kerucut extends BangunanRuang{

    double r,s,t;

    @Override
    public double Volume() {
        double volume = (3.14*r*r*t)/3;
        return volume;
    }
    @Override
    public double LuasPermukaan() {
        double LP = 3.14*r*(r + s);
        return LP;
    }

}