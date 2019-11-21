import java.util.*;
class lab3{
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
        String kata = pew.nextLine();
        ubah(kata);
        System.out.println(ubah(kata));
    }
    public static String ubah(String a){
        char [] arr = a.toCharArray();
        char h;
        for (int i = 0; i < arr.length; i++) {
            h = arr[i];
            if(Character.isUpperCase(h)){
                arr[i] = Character.toLowerCase(h);
            }
            if (Character.isLowerCase(h)){
                arr[i] = Character.toUpperCase(h);
            }
        }
        return new String(arr);
    }
}