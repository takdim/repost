/**
 * Tabung
 */
public class Tabung extends BangunanRuang{

    double r,t;

    @Override
    public double Volume() {
        double volume = 3.14*r*r*t;
        return volume;
    }
    @Override
    public double LuasPermukaan() {
        double LP = 2*3.14*r * (r + t);
        return LP;
    }

}