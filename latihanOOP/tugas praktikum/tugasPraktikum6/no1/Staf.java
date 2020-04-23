/**
 * Dosen
 */
public class Staf extends Pegawai{
    int plus = 50000;
    
    @Override
    public void bonus(String name, int value) {
        int total = (value*plus) + gaji;
        System.out.println(name + " mendapatkan gaji Rp. " + total);
    }

    
}