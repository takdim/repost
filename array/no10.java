import java.util.Scanner;
class no10{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int baris = pew.nextInt();
        int kolom = pew.nextInt();

        int [][] arr = new int [baris][kolom];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr [i][j] = pew.nextInt();
            }
        }
        for (int i = 0; i < kolom ; i++) {
            for (int j = baris-1; j >= 0; j--) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}