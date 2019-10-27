import java.util.*;
class latihanPraktikum{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        System.out.println("masukkan morse");
        String morse = pew.nextLine();
        
        String[] morse1Strings = morse.split("\\s+");
        HashMap<String, Character> sandi = new HashMap<>();

        sandi.put(".-", 'a');
        sandi.put("-...", 'b');
        sandi.put("-.-.", 'c');
        sandi.put("-..", 'd');
        sandi.put(".", 'e');
        sandi.put("..-.", 'f');
        sandi.put("--.", 'g');
        sandi.put("....", 'h');
        sandi.put("..", 'i');
        sandi.put(".---", 'j');
        sandi.put("-.-", 'k');
        sandi.put(".-..", 'l');
        sandi.put("--", 'm');
        sandi.put("-.", 'n');
        sandi.put("---", 'o');
        sandi.put(".--.", 'p');
        sandi.put("--.-", 'q');
        sandi.put(".-.", 'r');
        sandi.put("..", 's');
        sandi.put("-", 't');
        sandi.put("..-", 'u');
        sandi.put("...-", 'v');
        sandi.put(".--", 'w');
        sandi.put("-..-", 'x');
        sandi.put("-.--", 'y');
        sandi.put("--..", 'z');
        sandi.put(".----", '1');
        sandi.put("..---", '2');
        sandi.put("...--", '3');
        sandi.put("....-", '4');
        sandi.put(".....", '5');
        sandi.put("-....", '6');
        sandi.put("--...", '7');
        sandi.put("---..", '8');
        sandi.put("----.", '9');
        sandi.put("-----", '0');

        
        for(String naruto : morse1Strings){
            sandi.get(naruto);
            System.out.print(sandi.get(naruto));
            
        }
    }   
}