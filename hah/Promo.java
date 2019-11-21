import java.util.Scanner;
class Promo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Harga awal = "+ n);
        if (n >= 100000){
            int diskonA = (n*50/100);
            int afterD = n-diskonA;
            if (afterD <= 50000){
                System.out.println("Harga setelah diskon = "+afterD);
            } else if (afterD > 50000){
                System.out.println("Harga setelah  diskon =" + (n-50000));
            }
        } else if (n < 50000){
            int diskonB = (n*70/100);
            int afterD2 = n-diskonB;
            System.out.println("Harga setelah diskon = "+ afterD2);
        } else {
            System.out.println("Tidak ada diskon");
        }
    }
}