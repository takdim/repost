import java.util.Scanner;
class HeadnTail {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int n = s.length();

        char start = s.charAt(0);
        char end = s.charAt(n-1);
        
        String tengah  = s.substring(1, n-1);

        String niu = "";
        for (int i = 0; i < tengah.length(); i++) {
            niu += (tengah.codePointAt(i)+ " ");
            
        }

        System.out.println("Kata awal : "+s);
        System.out.printf("Kata akhir : %s, %s, %s", start, niu, end);
    }
}