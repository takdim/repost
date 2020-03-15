/**
 * Kubus
 */
public class Kubus extends BangunanRuang{

    double s;
    @Override
    public double Volume() {
        double volume = s*s*s;
        return volume;
    }
    @Override
    public double LuasPermukaan() {
        double LP = 6*(s*s);
        return LP;
    }
    
}