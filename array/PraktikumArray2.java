import java.util.Scanner;
class PraktikumArray2{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int i = pew.nextInt();
        int j = pew.nextInt();
        int k = pew.nextInt();

        int [][] matrixA = new int[i][j];
        int [][] matrixB = new int[j][k];
        System.out.println("input matrix A");
        for(int l = 0; l<i;l++){
            for (int m=0;m<j;m++){
                matrixA[l][m] = pew.nextInt();
            }
        }
        System.out.println("input matrix B");
        for(int l = 0; l<j;l++){
            for (int m=0;m<k;m++){
                matrixB[l][m] = pew.nextInt();
            }
        }
        System.out.println("matrix A * matrix B");
        for (int l = 0;l<i;l++){
            for (int m = 0; m < k; m++) {
                int kew = 0;
                for (int s = 0; s < j; s++) {
                    kew += matrixA[l][s]*matrixB[s][m];
                }
                System.out.print(kew + " ");
            }
            System.out.println();
        }
        
    }
}