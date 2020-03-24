/**
 * Addition
 */
public class Addition {

    private int drink;
    private int saus;
    private int potato;
    private int tomato;
    int harga;

    
    public void setDrink(int drink) {
        this.drink = drink;
        harga += drink * 3500;
    }
    public int getDrink() {
        return this.drink;
    }
    
    public void setSaus(int saus) {
        this.saus = saus;
        harga += saus * 2000;
    }
    public int getSaus() {
        return this.saus;
    }

    public void setPotato(int potato) {
        this.potato = potato;
        harga += potato * 5000;
    }
    public int getPotato() {
        return this.potato;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
        harga += tomato * 4000;
    }
    public int getTomato() {
        return this.tomato;
    }
    
    //public 
    

    
}