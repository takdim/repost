import java.util.*;
import java.util.ArrayList;
class Item{
    private String name;
    private int price;
    private String info;

    static Scanner pew = new Scanner(System.in);
    
   public Item(String name, int price, String info){
       this.name = name;
       this.price = price;
       this.info = info;
   }
   public String getName(){
       return name;
   }
   public int getPrice(){
       return price;
   }
//    public String getInfo(){
//         return String.format("Item : %s\n\tDescription : %s\n\tPrice : %d", name, info, price);
//    }

    // public void use(){
    //     name = "---";
    //     price = 0;
    //     info = "nothing";
    // }

    public boolean hpPotion(){
        if(name.equals("Hp Potion")){
            return true;
        }
        return false;
    }

    public static void descItem(Item items){
        System.out.println();
        System.out.println("name :" +items.getName());
        System.out.println("price :" +items.getPrice());
        System.out.println();
    }

}