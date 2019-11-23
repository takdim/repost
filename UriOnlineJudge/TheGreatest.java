import java.util.Scanner;
class TheGreatest{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int a = pew.nextInt();
        int b = pew.nextInt();
        int c = pew.nextInt();
        int bantu= a;
        if(a<c || a<b){
            if(b<c){
                bantu = c;
            }else{
                bantu = b;
            }
        }else{
            bantu=a;
        }
        System.out.println(bantu + " eh o maior");
    }
}