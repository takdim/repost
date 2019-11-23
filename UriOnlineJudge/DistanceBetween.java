import java.util.Scanner;
class DistanceBetween{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        double x1 = pew.nextDouble();
        double y1 = pew.nextDouble();
        double x2 = pew.nextDouble();
        double y2 = pew.nextDouble();

        double distance = Math.sqrt(Math.pow((x2 - x1), 2)+ Math.pow(y2 - y1, 2));
        System.out.printf("%.4f", distance);
        System.out.println();
    }
}