import java.util.*;
class AreaOfCircle{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        double R = pew.nextDouble();
        double PI = 3.14159;

        double A = PI * Math.pow(R, 2);
        //float A = (float) math;
        System.out.printf("A=%.4f", A);
        System.out.println();
    }
}