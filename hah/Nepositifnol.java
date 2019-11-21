import java.util.Scanner;
class Nepositifnol {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        if (x==0){
            System.out.println(x+" nol");
        } else if (x>0){
            System.out.println(x+" positif");
        } else if (x<0) {
            System.out.println(x+" negatif");
        }
    }
}