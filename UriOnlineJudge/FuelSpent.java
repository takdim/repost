import java.util.Scanner;
class FuelSpent{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int hour = pew.nextInt();
        int km = pew.nextInt();

        double liter = (double) (hour*(km/12.0));
        System.out.printf("%.3f\n", liter);
    }
}