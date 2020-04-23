/**
 * Main
 */
import java.util.Scanner;
public class Main {
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
        Staf staf = new Staf();
        // Pegawai pegawai = (Pegawai) staf;
        Pegawai pegawai = new Pegawai();
        Dosen dosen = new Dosen();

        //admin --> Pegawai --> dosen;staf
        
        System.out.print("nama Staf     : " );
        String name = pew.nextLine();
        System.out.print("jumlah kehadiran :  ");
        int value = pew.nextInt();
        pew.nextLine();

        System.out.print("nama Dosen        : ");
        String nama = pew.nextLine();
        System.out.print("jumlah SKS        : ");
        int val = pew.nextInt();
        pew.nextLine();
        
        System.out.print("nama Pegawai      : ");
        String name3 = pew.nextLine();
        int value3 = 0;

        System.out.println();
        staf.bonus(name, value);
        dosen.bonus(nama, val);
        pegawai.bonus(name3, value3);
        
    }
}