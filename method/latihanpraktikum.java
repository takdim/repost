import java.util.*;
class latihanpraktikum{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        System.out.println("pilih luas bangun datar atau volume bangun ruang(1 atau 2)");
        int pilih = pew.nextInt();
        if (pilih==1){
            int a = pew.nextInt();
            int b = pew.nextInt(); 
            int c = pew.nextInt(); 
            luasPersegi(a, b);
            Double.valueOf(luasSegitiga(a, b));
            Double.valueOf(luasTrapesium(a, b, c));
            luasPersegiPanjang(a, b);
            luasJajarGenjang(a, c);
            Double.valueOf(luasLayangLayang(a, b));
            Double.valueOf(luasBelahKetupat(a, b));
        System.out.println("luas bangun datar");
        System.out.println("======================================");
        System.out.println("luas persegi = " + luasPersegi(a, b));
        System.out.println("luas segitiga = " + luasSegitiga(a, b));
        System.out.println("luas trapesium = " + luasTrapesium(a, b, c));
        System.out.println("luas persegi panjang = " + luasPersegiPanjang(a, b));
        System.out.println("luas jajar genjang = " + luasJajarGenjang(a, c));
        System.out.println("luas layang layang = " + luasLayangLayang(a, b));
        System.out.println("luas belah ketupat = " + luasBelahKetupat(a, b));

        }else if (pilih==2){
            int a = pew.nextInt();
            int b = pew.nextInt(); 
            int c = pew.nextInt(); 
            System.out.println("masukkan nilai Pi");
            double Pi = pew.nextDouble();
            volumeKubus(a);
            volumeBalok(a, b, c);
            volumeLimas(a, c);
            volumeTabung(Pi, b, c);
            volumePrisma(a, c);
            volumeKerucut(Pi, b, c);
            volumeBola(Pi, b);
            System.out.println("volume bangun ruang");
        System.out.println("======================================");
        System.out.printf("volume kubus = %.2f\n", volumeKubus(a));
        System.out.printf("volume balok = %.2f\n", volumeBalok(a, b, c));
        System.out.printf("volume limas = %.2f\n", volumeLimas(a, c));
        System.out.printf("volume prisma = %.2f\n", volumePrisma(a, c));
        System.out.printf("volume tabung = %.2f\n",  volumeTabung(Pi, b, c));
        System.out.printf("volume kerucut = %.2f\n", volumeKerucut(Pi, b, c));
        System.out.printf("volume bola = %.2f\n", volumeBola(Pi, b));
        }
        

        
        
    }
    static int luasPersegi(int n, int m){
        return n*m;
    }
    static Double luasSegitiga(int n , int m){
        return Double.valueOf((n*m)/2);
    }
    static Double luasTrapesium(int n, int m , int l){
        return Double.valueOf((n+m)*l/2);
    }
    static int luasPersegiPanjang(int n, int m){
        return n*m;
    }
    static int luasJajarGenjang(int n, int l){
        return n*l;
    }
    static Double luasLayangLayang(int n, int m){
        return Double.valueOf((n*m)/2);
    }
    static Double luasBelahKetupat(int n, int m){
        return Double.valueOf((n*m)/2);
    }
    //bangun ruang
    static Double volumeKubus(int n){
        return Double.valueOf(n*n*n);
    }
    static Double volumeBalok(int n, int m, int k){
        return Double.valueOf(n*m*k);
    }
    static Double volumeLimas(int n, int m){
        return Double.valueOf((n*m)/3);
    }
    static Double volumePrisma(int n, int m){
        return Double.valueOf(n*m);
    }
    static Double volumeTabung(Double n, int m, int l){
        return Double.valueOf(n*m*m*l);
    }
    static Double volumeKerucut(Double n,int m,int l){
        return  Double.valueOf((n*m*m*l)/3);
    }
    static Double volumeBola(Double n, int m){
        return Double.valueOf((n*m*m*m*4)/3);
    }
}