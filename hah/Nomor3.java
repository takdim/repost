import java.util.Scanner;
class Nomor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String sentence = sc.nextLine();
        int n = sentence.length();
        
        for (int i = 0; i < n; i++) {
            int ascii = Character.codePointAt(sentence, i);
            if (ascii >= 65 && ascii <= 90) {
                System.out.print(Character.toString(ascii+32));
            } else if (ascii>= 97 && ascii <= 122) {
                System.out.print(Character.toString(ascii-32));
            } else {
                System.out.print(Character.toString(ascii));
            }
            
        }
    }
}