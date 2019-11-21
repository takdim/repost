import java.util.ArrayList;
import java.util.Scanner;
class Nomor2 {
    static Integer carry = 0;
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hasil = (char) a+b;
        System.out.println(hasil);
        
    }
}