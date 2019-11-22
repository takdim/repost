import java.util.Scanner;

class SimpleSum
{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int a = pew.nextInt();
        int b = pew.nextInt();

        int PROD = a*b;

        System.out.println("PROD = " + PROD);
    }
}