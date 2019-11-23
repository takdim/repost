import java.util.Scanner;
class Consumption{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int X = pew.nextInt();
        float Y = pew.nextFloat();

        float answer = (float)X/Y;
        System.out.printf("%.3f km/l", answer);
        System.out.println();
    }
}