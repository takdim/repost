import java.util.Scanner;
class Nomor6{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();                       //jumlah angka
        int arr [] = new  int [a];

        for (int i = 0; i < a; i++) {             // input angka-angka
            arr[i] = sc.nextInt();
        }

        //itung modus
        int jlhAngka = 0;
        int jlhModus = 0;
        int modus = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (arr[j] == arr[i] && j!=i){
                    jlhAngka++;
                }
            }
            if (jlhAngka >= jlhModus) {
                jlhModus = jlhAngka;
                modus = arr[i];
                jlhAngka=0;
            }
        }
        System.out.println(modus);
    }
}