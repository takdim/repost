import java.util.*;
class SimpleCalculate{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int a = pew.nextInt();
        int b = pew.nextInt();
        float c = pew.nextFloat();
        float sum;
        sum = b*c;

        a = pew.nextInt();
        b = pew.nextInt();
        c = pew.nextFloat();
        sum += b*c;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", sum);
    }
}