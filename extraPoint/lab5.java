import java.util.*;
class lab1{
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
        int n = pew.nextInt();
        
        int [][] arr = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = pew.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < n-2; j++) {
            if (hour(i, j, arr) > sum) {
               sum = hour(i, j, arr);
            }
            }
        }
        System.out.println(sum);
    }
    static int hour(int i, int j, int num[][]){
        int k = num[i][j] + num[i][j+1]+num[i][j+2];
        int l = num[i+1][j+1];
        int m = num[i+2][j]+ num[i+2][j+1]+ num[i+2][j+2];
        return k+l+m;
    }
}