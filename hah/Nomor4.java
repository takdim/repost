import java.util.Scanner;
class Nomor4{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine(); 
        boolean[] alfabet = new boolean[26]; 
        int set = 0;
        int input = 1;

        for (int i = 0; i < str.length(); i++) {
           if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
              set = str.charAt(i) - 'A'; 
           }else if( str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z') {
              set = str.charAt(i) - 'a'; 
           }
           alfabet[set] = true; 
        }
        for (int i = 0; i < 26; i++) {
           if (alfabet[i] == false)
              input = 0;
        }
        
        if (input == 1)
           System.out.print("\nPangram");
        else
           System.out.print("\nBukan Pangram");
     }
  }