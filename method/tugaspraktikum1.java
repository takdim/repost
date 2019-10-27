import java.util.*;
class tugaspraktikum1{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        System.out.println("masukkan angka pertama");
        int n= pew.nextInt();
        System.out.println("masukkan angka kedua");
        int m = pew.nextInt();
        
        FPB(n,m);
        System.out.println("FPB dari " + n + " dan " + m +" adalah " +FPB(n, m));
    }
    static int FPB(int num1, int num2){
        do {
            int save = num2;
            num2 = num1%num2;
            num1 = save;
        } while (num2 != 0);
        
        return num1;
    }
}
