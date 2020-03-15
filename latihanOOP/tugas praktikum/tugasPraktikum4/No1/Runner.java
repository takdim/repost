/**
 * Runner
 */
import java.util.*;
public class Runner {

    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        
        System.out.println("==== 1. Bangun Ruang ====");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Prisma");
        System.out.println("4. Bola");
        System.out.println("5. Tabung");
        System.out.println("6. Limas");
        System.out.println("7. Kerucut");

        System.out.println();
        System.out.println("==== 2. Bangun Datar ====");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.println("5. Trapesium");
        System.out.println("6. Jajargenjang");
        System.out.println("7. Layang-layang");
        System.out.println("8. Belah Ketupat");
    
        System.out.println();
        System.out.println("choose :");
        int choose = pew.nextInt();
        if(choose == 1){
            System.out.println("pilih bangun ruang");
            int choose2 = pew.nextInt();
            if(choose2 == 1){
                System.out.println();
                Kubus kubus = new Kubus();
                System.out.println("masukkan s");
                kubus.s = pew.nextDouble();
                System.out.println("volume = " + kubus.Volume());
                System.out.println("luas permukaan = " + kubus.LuasPermukaan());
                
            }else if(choose2 == 2){
                Balok balok = new Balok();
                System.out.println("masukkan p");
                balok.p = pew.nextDouble();
                System.out.println("masukkan l");
                balok.l = pew.nextDouble();
                System.out.println("masukkan t");
                balok.t = pew.nextDouble();
                System.out.println("volume = " + balok.Volume());
                System.out.println("luas permukaan = " + balok.LuasPermukaan());
            }else if(choose2 == 3){
                Prisma prisma = new Prisma();
                prisma.La = pew.nextDouble();
                prisma.K = pew.nextDouble();
                prisma.t = pew.nextDouble();
                System.out.println("volume = " + prisma.Volume());
                System.out.println("luas permukaan = " + prisma.LuasPermukaan());
            }else if(choose2 == 4){
                Bola bola = new Bola();
                bola.r = pew.nextDouble();
                System.out.println("volume = " + bola.Volume());
                System.out.println("luas permukaan = " + bola.LuasPermukaan());
            }else if(choose2 == 5){
                Tabung tabung = new Tabung();
                tabung.r = pew.nextDouble();
                tabung.t = pew.nextDouble();
                System.out.println("volume = " + tabung.Volume());
                System.out.println("luas permukaan = " + tabung.LuasPermukaan());
            }else if(choose2 == 6){
                Limas limas = new Limas();
                limas.Lalas = pew.nextDouble();
                limas.Ja = pew.nextDouble();
                limas.t = pew.nextDouble();
                System.out.println("volume = " + limas.Volume());
                System.out.println("luas permukaan = " + limas.LuasPermukaan());
            }else if(choose2 == 7){
                Kerucut kerucut = new Kerucut();
                kerucut.r = pew.nextDouble();
                kerucut.s = pew.nextDouble();
                kerucut.t = pew.nextDouble();
                System.out.println("volume = " + kerucut.Volume());
                System.out.println("luas permukaan = " + kerucut.LuasPermukaan());
            }
        }else{
            System.out.println("pilih bangun datar");
            int choose3 = pew.nextInt();
            if(choose3 == 1){
                Persegi persegi = new Persegi();
                System.out.println("masukkan s");
                persegi.sisi = pew.nextDouble();
                System.out.println("Luas = " + persegi.Luas());
                System.out.println("keliling = " + persegi.Keliling());
            }else if(choose3 == 2){
                PersegiPanjang persegiPanjang = new PersegiPanjang();
                persegiPanjang.p = pew.nextDouble();
                persegiPanjang.l = pew.nextDouble();
                System.out.println("Luas = " + persegiPanjang.Luas());
                System.out.println("Keliling = " + persegiPanjang.Keliling());
            }else if (choose3 == 3){
                Lingkaran lingkaran = new Lingkaran();
                lingkaran.r = pew.nextDouble();
                System.out.println("Luas = " + lingkaran.Luas());
                System.out.println("keliling = " + lingkaran.Keliling());

            }else if(choose3 == 4){
                Segitiga segitiga = new Segitiga();
                segitiga.a = pew.nextDouble();
                segitiga.t = pew.nextDouble();
                segitiga.s = pew.nextDouble();
                System.out.println("luas = " + segitiga.Luas());
                System.out.println("keliling = " + segitiga.Keliling());
            }else if(choose3 == 5){
                Trapesium trapesium = new Trapesium();
                trapesium.a = pew.nextDouble();
                trapesium.t = pew.nextDouble();
                trapesium.b = pew.nextDouble();
                trapesium.c = pew.nextDouble();
                System.out.println("luas = " + trapesium.Luas());
                System.out.println("keliling = " + trapesium.Keliling());
            }else if(choose3 == 6){
                JajarGenjang jajarGenjang = new JajarGenjang();
                jajarGenjang.a = pew.nextDouble();
                jajarGenjang.t = pew.nextDouble();
                jajarGenjang.b = pew.nextDouble();
                jajarGenjang.c = pew.nextDouble();
                System.out.println("luas = " + jajarGenjang.Luas());
                System.out.println("keliling = " + jajarGenjang.Keliling());
            }else if(choose3 == 7){
                Layang layang = new Layang();
                layang.d1 = pew.nextDouble();
                layang.d2 = pew.nextDouble();
                System.out.println("luas = " + layang.Luas());
                System.out.println("keliling = " + layang.Keliling());
            }else if(choose3 == 8){
                BelahKetupat belahKetupat = new BelahKetupat();
                belahKetupat.d1 = pew.nextDouble();
                belahKetupat.d2 = pew.nextDouble();
                System.out.println("luas = " + belahKetupat.Luas());
                System.out.println("keliling = " + belahKetupat.Keliling());
            }
        }
        
        
        

    }
}