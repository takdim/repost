import java.util.*;
class SalaryWithBonus{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        String name = pew.next();
        double a = pew.nextDouble();
        double b = pew.nextDouble();

        double TOTAL = (a+b*0.15);
        System.out.printf("TOTAL = R$ %.2f", TOTAL);
        System.out.println();
    }
}