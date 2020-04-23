/**
 * Dosen
 */
public class Dosen extends Pegawai{
    //bonus per sks
    int plus = 120000;

    @Override //value = sks
    public void bonus(String name, int value) {
        int total = (value*plus) + gaji;
        System.out.println(name + " mendapatkan gaji Rp. " + total);
    }

    
    
}