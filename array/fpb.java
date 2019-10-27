import java.util.Scanner;
class fpb{
public static void main(String[] args) {
    Scanner pew = new Scanner(System.in);
    int num1 = pew.nextInt();
    int num2 = pew.nextInt();
    // menggunakan 
    do {
            int save = num2;
            num2 = num1%num2;
            num1 = save;
        } while (num2 != 0);
        int result = num1;
        System.out.println(result);
    }
}