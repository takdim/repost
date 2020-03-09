/**
 * Player
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Player {
    static Scanner pew = new Scanner(System.in);
    private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;
    private int money;
    private List <Item> items;

    public Player(String name, String role){
        this.name = name;
        this.role = role;
        hp = 100;
        level = 0;
        damage = ThreadLocalRandom.current().nextInt(2, 10);
        energy = 100;
        money = 100;
        items = new ArrayList<>();
        items.add(new Item("Hp potion", 20, "+20 Hp"));
        items.add(new Item("Hp potion", 20, "+20 Hp"));

    }
    public List<Item> getItem(){
        return items;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return role;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public int getMoney(){
        return money;
    }

    public void showStatus(){
        System.out.println();
        System.out.println("name " + name);
        System.out.println("role " + role);
        System.out.println("level " + level);
        System.out.println("hp " + hp);
        System.out.println("energy " + energy);
        System.out.println("money " + money);
        System.out.println();
    }

    
    public void showItems(){
        System.out.println();
        for (int i = 0; i < items.size(); i++) {
            Item.descItem(items.get(i));
        }
        
        System.out.println();
    }
    public void sell(int count){
        int jual = items.get(count).getPrice();
        System.out.println("sell this item?");
        String answer = pew.next().toLowerCase();
        if(answer.equals("y")){
            items.remove(count);
            money += 20;
        }
        
    }

    public String getDamage(Player player){
        double crit = ThreadLocalRandom.current().nextDouble(0, 100);
        energy -= 3;
        if(energy <= 0){
            return "no energy, use potion";
        }
        if(crit > damage*10){
            player.hp = player.hp - (damage + (crit/10));
            
            //return jumlah attack+crit
            return String.format("critical!!! %s recieved %f damage", name, (damage + (crit/10)), energy);
        }
        //normal attack
        player.hp = player.hp -damage;
        return String.format("%s received %f damage", name, damage);
    }

    // public boolean attack(Player player){
    //     if(!dead(player)){
    //         System.out.println(player.getDamage());
    //         // damage += 3;
    //         // money += 30;
    //     }return false;
    // }

    public boolean dead(Player player){
        if(player.hp <= 0){
            return true;
        }else{
            return false;
        }
    }

    public void healing(Player player){
        if(!dead(player)){
            if(player.hp >= 100){
                player.hp = 100;
                System.out.println("Hp max!");
            }else{
                for (int i = 0; i < items.size(); i++) {
                    if(items.get(i).hpPotion()){
                        player.hp += 20;
                        break;
                    }else if(i == items.size()-1){
                        System.out.println("no Hp potion");
                    }
                }
            }
        }
    }

    public void buy(Player player, int count){
        if(!dead(player)){
            for (int i = 0; i < count; i++) {
                items.add(new Item("Hp Potion", 20, "+20 Hp"));
                money -= 20;
            }
        }

    }
}