/**
 * BurgerNugget
 */
public class BurgerNugget extends Burger{
    int harga;
    public BurgerNugget(String rasa, int jumlah) {
        super(rasa, jumlah);
        harga = jumlah * 15000;
    }

    
}