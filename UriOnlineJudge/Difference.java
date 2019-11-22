import java.util.Scanner;
class Difference{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int A = pew.nextInt();
        int B = pew.nextInt();
        int C = pew.nextInt();
        int D = pew.nextInt();

        int diff = (A*B-C*D);
        System.out.println("DIFFERENCA = " + diff);
    }
}