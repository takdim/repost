import java.util.*;
class lab2{
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
        String word = pew.nextLine();
        swap(word);
        System.out.println(swap(word));
    }
    static String swap (String a){
        StringBuilder build = new StringBuilder(a);
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) > 96 && a.charAt(i) < 123){
                build.setCharAt(i, (char)(a.charAt(i) - 32));
            }
        }
        return build.toString();
    }
}