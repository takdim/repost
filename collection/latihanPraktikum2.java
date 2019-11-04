import java.util.*;
class latihanPraktikum2{
    public static void main(String[] args) {
        //inpurt batas
        Scanner pew = new Scanner (System.in);
        System.out.println("PROGRAM MENCARI BILANGAN YANG BISA DIBAGI DIGITNYA");
        System.out.print("BATAS BAWAH ");
        int angka1 = pew.nextInt();
        System.out.print("BATAS ATAS ");
        int angka2 = pew.nextInt();
        System.out.printf("BILANGAN YANG BISA DIBAGI DIGITNYA DARI (%d) SAMPAI (%d) ADALAH : \n",angka1,angka2);
        int digit;
        ArrayList<Integer>hasil=new ArrayList<>();
        //menentukan mana batas
        int batasBawah = angka2>angka1?angka1:angka2;
        int batasAtas = angka2>angka1?angka2:angka1;
        //perulangan membagi dengan digit
        for(int angka=batasBawah;angka<=batasAtas;angka++){
            HashMap<Integer, Integer> number = new HashMap<>();
            //menentukan digit
            int ko = angka;
            int aka = 0;
            while(Math.abs(ko)>0){
                digit = Math.abs(ko)%10;
                ko = Math.abs(ko)/10;
                number.put(aka,digit);
                aka++;
            }
            ko=angka;
            int digitYes = 0;
            //mengecek pembagian digit
            for(int k=0;k<number.size();k++){
                if(number.get(k)!=0&&ko%Math.abs(number.get(k))==0){
                    digitYes++;
                }
            }
            //menambahkan jika bisa dibagi dengan digit
            if(digitYes==aka){
                hasil.add(ko);
            }
        }//menukar output jika inputnya tertukar
        if(angka1>angka2){
            Collections.reverse(hasil);
            System.out.print(hasil);
        }
        else{
            System.out.print(hasil);
        }
        
    }
}