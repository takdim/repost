/**
 * MainPokemon
 */
import java.util.*;
public class MainPokemon {

    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        System.out.println("insert pokemon1");
        System.out.println("name");
        String name = pew.next();
        System.out.println("type");
        String type = pew.next();
        System.out.println("attack");
        int attack = pew.nextInt();
        System.out.println("defense");
        int def = pew.nextInt();
        Pokemon2 poke1 = new Pokemon2(name, type, attack, def);

        System.out.println("insert pokemon2");
        System.out.println("name");
        String name2 = pew.next();
        System.out.println("type");
        String type2 = pew.next();
        System.out.println("attack");
        int attack2  = pew.nextInt();
        System.out.println("defense");
        int def2 = pew.nextInt();
        Pokemon2 poke2 = new Pokemon2(name2, type2, attack2, def2);

        boolean p = false;
        int menu = 0;
        while(menu != 2){
            //note = attack  1 is for pokemon1, attack2 for pokemon2 and repeat
            System.out.println("1. attack");
            System.out.println("2. quit");
            menu = pew.nextInt();
            if(menu == 1){
                if(p == false){
                    poke1.getDamage(poke2);
                    poke1.desc();
                    poke2.desc();
                    p = true;
                }else{
                    poke2.getDamage(poke1);
                    poke1.desc();
                    poke2.desc();
                    p = false;
                }
            }
            if(poke1.Dead(poke2) || poke2.Dead(poke1)){
                if (poke2.Dead(poke1)){
                    System.out.println(poke1.getName() + " mati ");
                    System.out.println();
                    System.out.println(poke2.getName() + "winner");
                }else{
                    System.out.println(poke2.getName() +  " mati ");
                    System.out.println();
                    System.out.println(poke2.getName() + "winner");
                }
                break;
            }

        }
    }
}