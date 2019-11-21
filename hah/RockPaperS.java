import java.util.Scanner;
class RockPaperS {
    public static void main (String [] args){
        System.out.println("BATU GUNTING KERTAS");
        Scanner sc = new Scanner(System.in);
        System.out.print("P1 : ");
        String p1 = sc.nextLine().toLowerCase();
        System.out.print("P2 : ");
        String p2 = sc.nextLine().toLowerCase();
        char a = p1.charAt(0);
        char b = p2.charAt(0);

        if (a == 'b' && b == 'g' || a == 'g' && b == 'g' || a == 'k' && b == 'k'){
            System.out.println("It's a TIE");
        } else if (a == 'b' && b == 'g' || a == 'g' && b == 'k' || a == 'k' && b == 'b'){
            System.out.println("P1 WIN");
        } else if (a == 'b' && b == 'k' || a == 'g' && b == 'b' || a == 'k' && b == 'g'){
            System.out.println("P2 WIN");
        } else {
            System.out.println("Invalid Input!");
        }
        
    }
}