import java.util.Scanner;
class Prima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prima;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0){
                prima = false;
                System.out.println(prima);
                System.exit(0);
            }
        }   
            prima = true;
            System.out.println(prima);
    }
}