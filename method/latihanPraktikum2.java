import java.util.*;
class latihanPraktikum2{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int n = pew.nextInt();
        int m = pew.nextInt();
        String serialNumber = serialAngka(n, m);
        System.out.println(serialNumber);

    }
    static String serialAngka(int a, int b){
        String str = "";
        Random key = new Random();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int z = key.nextInt(10);
                str += z;
            }
            if (i < (a-1)){
                str += "-";
            }
        }
        return str;
    }
}