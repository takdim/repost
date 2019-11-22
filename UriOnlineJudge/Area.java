import java.util.Scanner;
class Area{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        double A = pew.nextDouble();
        double B = pew.nextDouble();
        double C = pew.nextDouble();//r for circle
        double pi = 3.14159;

        double rectangleTriangle = (A*C)/2;
        double circle = (pi*(C*C));
        double trapezium = ((A+B)*C/2);
        double square = (B*B);
        double rectangle = A*B;
        System.out.printf("TRIANGULO: %.3f\n", rectangleTriangle);
        System.out.printf("CIRCULO: %.3f\n", circle);
        System.out.printf("TRAPEZIO: %.3f\n", trapezium);
        System.out.printf("QUADRADO: %.3f\n", square);
        System.out.printf("RECTANGULO: %.3f\n", rectangle);
        System.out.println();
    }
}