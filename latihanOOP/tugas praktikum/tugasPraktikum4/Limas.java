/**
 * Limas
 */
public class Limas extends BangunanRuang{

    double Lalas,Ja,t;

    @Override
    public double Volume() {
        double volume = (Lalas*t)/3;
        return volume;
    }
    @Override
    public double LuasPermukaan() {
        double LP = Lalas + Ja;
        return LP; 
    }
}