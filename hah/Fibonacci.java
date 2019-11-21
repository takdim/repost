import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =  0;
        int b = 1;
        int hasil = 0;
        
        if (n>0 && n<=30){
            for (int i = 0; i < n; i++) {
                a = b;
                b = hasil;
                hasil = a+b;
                
            }
            System.out.println(hasil);
        }
    }
}