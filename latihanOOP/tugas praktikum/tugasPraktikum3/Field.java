public class Field {
    private int[] tinggiBambu =  new int[10];

    public Field(int[] arr) {
        this.tinggiBambu = arr;
    }

    public void setTinggiBambu(int indeks, int tinggi) {
        this.tinggiBambu[indeks] = tinggi;
    }

    public int getTinggiBambu(int indeks) {
        return this.tinggiBambu[indeks];
    }

    public int getMinTall() {
        int min = this.tinggiBambu[0];
        for(int i = 1; i < this.tinggiBambu.length; i++) {
            min = min < this.tinggiBambu[i] ? min : this.tinggiBambu[i]; 
        }
        return min;
    }

    
    
}