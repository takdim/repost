import java.util.Scanner;
class PraktikumArray1{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int batas = pew.nextInt();
        int [] arr = new int[batas];

        for (int i = 0; i < arr.length; i++) {
            arr [i] = pew.nextInt();
        }
        for (int i = 0; i < batas-1; i++) {
            for (int j = i+1; j < batas; j++) {
                int angka1 = arr [i];
                int angka2 = arr [j];


                if (angka1 % angka2 != 0 && angka2 % angka1 != 0){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}