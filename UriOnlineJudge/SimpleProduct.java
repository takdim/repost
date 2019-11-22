import java.util.Scanner;
class SimpleProduct{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int A = pew.nextInt();
        int B = pew.nextInt();

        int SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }
}