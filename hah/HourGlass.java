import java.util.Scanner;
class HourGlass{
    static int findMaxSum(int[][] arr, int A, int B) {
        if (B < 3 || A < 3)
            return -1;

        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < B - 2; i++) {
            for (int j = 0; j < A - 2; j++) {
                int sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]) + (arr[i + 1][j + 1]) + (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int A = arr.length;
        int B = arr.length;

        int hourGlass = findMaxSum(arr, A, B);
        if (hourGlass == -1)
            System.out.println("-");
        else
            System.out.println(hourGlass);
    } 

}
