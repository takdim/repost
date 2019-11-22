import java.util.*;
class Salary{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int A = pew.nextInt();
        int B = pew.nextInt();
        float C = pew.nextFloat();

        float sal =(float) B*C;
        System.out.println("NUMBER = " + A);
        System.out.printf("SALARY = U$ %.2f", sal);
        System.out.println();
    }
}