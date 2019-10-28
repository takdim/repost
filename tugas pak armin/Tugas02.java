import java.util.Scanner;
class Tugas02{
    public static void main(String[] args) {
        // // input = - 2 matriks Ap.q dan Br.s
        //            - data entry diinput manual
        //   output = AB dan BA
        // contoh =
        // masukkan ukuran matriks A
        // p = ..? 2
        // q = ..? 3
        // masukkan ukuran matriks B
        // r = .. ? 2
        // s = ..? 3
        Scanner pew = new Scanner(System.in);
        System.out.println("nila p = ");
        int p = pew.nextInt();
        System.out.println("nilai q = ");
        int q = pew.nextInt();
        System.out.println("nilai r = ");
        int r = pew.nextInt();
        System.out.println("nilai s");
        int s = pew.nextInt();
        int [][] A = new int [p][q];
        int [][] B = new int [r][s];
        System.out.println("masukkan matriks A");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print("Unsur " + "A" +"[" + i + "," + j + "] = ");
                A[i][j] = pew.nextInt();
            }
        }
        System.out.println("masukkan matriks B");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print("Unsur " + "B" +"[" + i + "," + j + "] = ");
                B[i][j] = pew.nextInt();
            }
        }
        //syarat bila baris matriks awal tidak sama dengan kolom matriks kedua maka tak bisa dikalikan
        //matriks A * B jika baris matriks A dan kolom  matriks B sama 
        if ( p == s){
            System.out.println("matriks A * B");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                int kew = 0;
                for (int k = 0; k < q; k++) {
                    kew += A[i][k] * B[k][j];
                }
                System.out.print(kew + " ");
            }
            System.out.println();
        }
        System.out.println("matriks B * A");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < q; j++) {
                int kew = 0;
                for (int k = 0; k < s; k++) {
                    kew += B[i][k] * A[k][j];
                }
                System.out.print(kew + " ");
            }
            System.out.println();
        }
        }else {
            System.out.println("tidak bisa di perkalikan");
            System.out.println("syarat bila baris matriks awal tidak sama dengan kolom matriks kedua maka tak bisa dikalikan");
        }
    }
}