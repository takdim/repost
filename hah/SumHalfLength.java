import java.util.Scanner;
class SumHalfLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11};
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        int sumWithHalfLength = 0;
        for (int i = 0; i < arr.length/2; i++) {
            sumWithHalfLength += arr[i];
        }
        System.out.println(sumWithHalfLength);

        int sumWithOneThirdLength = 0;
        for (int i = 0; i < arr.length/3; i++) {
            sumWithOneThirdLength += arr[i];
        }
        System.out.println(sumWithOneThirdLength);

        int sumWithOneQuarterLength = 0;
        for (int i = 0; i < arr.length/3; i++) {
            sumWithOneQuarterLength += arr[i];
        }
        System.out.println(sumWithOneQuarterLength);

        }
}