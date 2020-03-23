/**
 * Main
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner pew = new Scanner (System.in);
        Count nilai = new Count();
        System.out.println();
        System.out.println("================================");
        System.out.println("masukkan nama siswa");
        String nama = pew.nextLine();
        nilai.setNama(nama);
        System.out.println("nilai uts");
        double nUts = pew.nextInt();
        nilai.setUts(nUts);
        System.out.println("================================");
        System.out.println("nilai uas");
        double nUas = pew.nextInt();
        nilai.setUas(nUas);
        System.out.println("================================");
        System.out.println("nilai tugas mandiri");
        double nM = pew.nextInt();
        nilai.setTMandiri(nM);
        System.out.println("================================");
        System.out.println("nilai murni yang di peroleh oleh " + nilai.getNama());
        System.out.println();
        System.out.println("Nilai Murni UTS                     = " + nilai.murniUts());
        System.out.println("Nilai Murni UAS                     = " + nilai.murniUas());
        System.out.println("Nilai Murni Tugas                   = " + nilai.murniTugas());
        System.out.println("Nilai Akhir yang diperoleh yaitu    = " + nilai.nilaiAkhir());
    }
}