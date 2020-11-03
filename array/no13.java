import java.util.Scanner;
class no13{
    public static void main(String[] args) {

        Scanner pew = new Scanner(System.in);
        int  t = pew.nextInt();//kasus
        int sum =0;
 
        int [] arr = new int[t];// rata"

        int [] arr2 = new int[t];
        for (int i = 0; i < t; i++) {
            
            int orang = pew.nextInt();
            int [] torang = new int[orang];

            for (int j = 0; j < orang; j++) {

                torang [j] = pew.nextInt();
                sum += torang[j];
            }
            sum /= orang;
            arr [i] = sum;
            sum = 0;
            arr2 [i] = 0;
            for (int l = 0; l < orang; l++) {
                if(torang[l] < arr[i]){
                    arr2 [i] += 1;
                }else {
                    arr [i] += 0;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(arr2[i]);
        }
    }
}