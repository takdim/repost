import java.util.*;
class lab2{
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
        int kode = pew.nextInt();
        int jumlah = pew.nextInt();

        if(kode == 1){
            System.out.println("Total : Rp" + 4000*jumlah);
        }else if(kode == 2){
            System.out.println("Total : Rp " + 4000*jumlah);
        }else if(kode == 3){
            System.out.println("Total : Rp" + 2000*jumlah);
        }else if(kode == 4){
            System.out.println("Total : Rp " + 1000*jumlah);
        }
    }
}