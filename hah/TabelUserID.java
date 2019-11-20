import java.util.Scanner;
class TabelUserID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String nama [] = new String[n];
        String nim [] = new String[n];
        int point [] = new int[n];

        for (int i = 0; i < n; i++) {
            String replaceNama = sc.next().replaceAll("_"," "); //_ into space
            nama [i] = replaceNama.substring(0,Math.min(replaceNama.length(), 20)); //<20 karakter
            String replaceNim = sc.next();
            nim [i] = replaceNim.substring(0,Math.min(replaceNim.length(), 10)); //<10 karakter
            point [i] = sc.nextInt();
            
        }

        System.out.printf("+--------------------+----------+-----------+\n");
        System.out.printf("+        NAMA        |   USER   |   POINT    +\n");
        System.out.printf("+--------------------+----------+-----------+\n");
    }
}