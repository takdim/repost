import java.util.Scanner;
class no12{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int sepatu = pew.nextInt();
        int [] h = new int [sepatu];
        String [] warna = new String [sepatu];
        boolean ketemu = false;
        System.out.println("ukuran dan warna yang ada");
        for (int i = 0; i < sepatu; i++) {
            h[i] = pew.nextInt();
            warna[i]= pew.next();
            
        }
        System.out.println("ukuran dan warna yang di inginkan winda");
        int pilih = pew.nextInt();
        String warnanya = pew.next();
        for (int i = 0; i < sepatu; i++) {
            if ( h[i] == pilih && warna[i].equalsIgnoreCase(warnanya)){
                ketemu = true;
                System.out.println("sepatu warna " + warna[i] + " berukuran " + h[i] + " ada pada index " + i);
            }
        }
        if ( ketemu == false){
            System.out.println("tidak ada");
        }
    }
}