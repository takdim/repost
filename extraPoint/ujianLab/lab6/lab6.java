import java.util.*;
class lab6{
    static Scanner pew = new Scanner (System.in);
    public static void main(String[] args) {
        double alas = pew.nextDouble();
        double tinggi = pew.nextDouble();

        double luas = (alas*tinggi)/2;
        System.out.println(luas);
    }
}