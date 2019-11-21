import java.util.Scanner;
class CariMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        int jumlah =0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            jumlah += arr[i];
        }
        double mean = (jumlah/n);
        System.out.println(mean);

    }
}