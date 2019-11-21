import java.util.*;
class lab3{
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("P1 : ");
        String p1 = pew.next();
        System.out.print("P2 : ");
        String p2 = pew.next();

        String [] game = {"batu", "gunting", "kertas"};
        
        if(p1.equalsIgnoreCase("batu") && p2.equalsIgnoreCase("kertas") || p1.equalsIgnoreCase("kertas") && p2.equalsIgnoreCase("gunting") || p1.equalsIgnoreCase("gunting") && p2.equalsIgnoreCase("batu")){
            System.out.println("P2 WIN");
        }else if(p1.equalsIgnoreCase("kertas") && p2.equalsIgnoreCase("batu") || p1.equalsIgnoreCase("gunting") && p2.equalsIgnoreCase("kertas") || p1.equalsIgnoreCase("batu") && p2.equalsIgnoreCase("gunting")){
            System.out.println("P1 WIN");
        }

    }
}