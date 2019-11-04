import java.util.*;
class syalala{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        String kata1 = pew.nextLine().replace(" ", "");
        String kata2 = pew.nextLine().replace(" ", "");

        if(checkAnagram(kata1, kata2)){
            System.out.println("nikmat");
        }else{
            System.out.println( "tidak nikmat");
        }
    }
    static boolean checkAnagram (String a, String b){
        char [] arr1 = a.toUpperCase().toCharArray();
        char [] arr2 = b.toUpperCase().toCharArray();

        if(arr1.length != arr2.length){
            System.out.println("tidak nikmat");
            return false;
        }else{
            int Xor = 0;
            for (int i = 0; i < arr1.length; i++) {
                Xor ^= arr1[i] ^ arr2[i];
            }
            return Xor == 0? true:false;
        }
    }
}