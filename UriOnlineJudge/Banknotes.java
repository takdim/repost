import java.util.Scanner;
class Banknotes{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int N = pew.nextInt();
        System.out.printf("%d\n", N);
        int konvert = N/100;
        N = N%100;
        System.out.printf("%d nota(s) de R$ 100,00\n", konvert);
        konvert = N/50;
        N = N%50;
        System.out.printf("%d nota(s) de R$ 50,00\n", konvert);
        konvert = N/20;
        N = N%20;
        System.out.printf("%d nota(s) de R$ 20,00\n", konvert);
        konvert = N/10;
        N = N%10;
        System.out.printf("%d nota(s) de R$ 10,00\n", konvert);
        konvert = N/5;
        N = N%5;
        System.out.printf("%d nota(s) de R$ 5,00\n", konvert);
        konvert = N/2;
        N = N%2;
        System.out.printf("%d nota(s) de R$ 2,00\n", konvert);
        konvert = N/1;
        N = N%1;
        System.out.printf("%d nota(s) de R$ 1,00\n", konvert);
        System.out.println();
    }
}