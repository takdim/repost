import java.util.*;
class lab3{
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
        int a = pew.nextInt();

        int [][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j]= pew.nextInt();
            }
        }
        System.out.println("hasil");
        lower(arr, a);

    }
    static void lower(int matrix[][], int mat) { 
        int bantu = 0;
        for (int i = 0; i < mat; i++) {
            for (int j = i+1; j < mat; j++) {
                if(matrix[i][j] != 0){
                    bantu=1;
                    break;

                }
            }
        }
        if(bantu==0){
            System.out.println("matrix segitiga bawah");
        }else{
            System.out.println("matrix segitiga atas");
        }
    } 
}