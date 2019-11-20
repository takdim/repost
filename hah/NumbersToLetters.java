import java.util.Scanner;
class NumbersToLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        String [] satuan = {"", "satu","dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan"};
        String [] puluhan = {"", "belas", "dua puluh", "tiga puluh", "empat puluh", "lima puluh", "enam puluh", "tujuh puluh", "delapan puluh", "sembilan puluh"};
        String [] ratusan = {"", "seratus"};

        int Ratusan = number/100;
        int Puluhan = (number%100)/10;
        int Satuan = (number%100)%10;

        if (number ==0){
            System.out.println("nol");
        }
        
        if (number >= 0 && number <= 100){
        if (Puluhan == 1){
            if (Satuan == 1){
                System.out.println("se"+puluhan[Puluhan]);
            } else if (Satuan == 0){
                System.out.println("sepuluh");
            } else {
                System.out.println(satuan[Satuan]+" "+puluhan[Puluhan]);
            }
        } else {
            System.out.println(ratusan[Ratusan]+" "+puluhan[Puluhan]+" "+satuan[Satuan]);
        }
        }
    }
}