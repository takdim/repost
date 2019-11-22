import java.util.*;
class Sphere{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        double R = pew.nextFloat();
        double pi = 3.14159;

        double volume = (4/3.0)*pi*(R*R*R);
        System.out.printf("VOLUME = %.3f", volume);
        System.out.println();
    }
}