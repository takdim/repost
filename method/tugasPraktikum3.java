import java.util.Scanner;

class tugasPraktikum2{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int ehem = pew.nextInt();

        myDay(ehem);
    }
    public static void myDay(int a){
        int tahun = a / 365;
        a = a % 365;
        int bulan = a / 30;
        a = a % 30;
        

        System.out.println(tahun + "tahun");
        System.out.println(bulan);
        System.out.println(a);
    }
}