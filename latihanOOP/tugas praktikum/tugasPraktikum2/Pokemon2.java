/**
 * Pokemon2
 */
public class Pokemon2 {

    private String name;
    private String type;
    private int attackP;
    private int defense;
    private int xp;
    private int hp;
    private boolean dead;

    public Pokemon2(String name, String type, int attackP , int defense){
        this.name = name;
        this.type = type;
        this.attackP = attackP;
        this.defense = defense;
        xp = 0;
        hp = 100;
    }
    public void getDamage(Pokemon2 enemy){
        if( defense < enemy.getAttackPower()){
            if(type == "water" && enemy.type == "electric"){
                enemy.hp = enemy.hp - Math.abs(enemy.defense - ((attackP)*(20/100)));
            }else if(type == "ground" && enemy.type == "water"){
                enemy.hp = enemy.hp - Math.abs(enemy.defense - ((attackP)*(20/100)));
            }else if(type == "fire" && enemy.type == "water"){
                enemy.hp = enemy.hp - Math.abs(enemy.defense - ((attackP)*(20/100)));
            }else if(type == "electric" && enemy.type == "ground"){
                enemy.hp = enemy.hp - Math.abs(enemy.defense - ((attackP)*(20/100)));
            }else{
                enemy.hp = enemy.hp - Math.abs(enemy.defense - (attackP));
            }
        }
        
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setAttackPower(int attackP){
        this.attackP = attackP;
    }
    public int getAttackPower(){
        return attackP;
    }
    public void desc(){
        System.out.println("name = " + name);
        System.out.println("type = " + type);
        System.out.println("hp = " + hp);
        System.out.println("defense = " + defense);
        System.out.println("attack =" + attackP);
        System.out.println();
    }
    public boolean Dead(Pokemon2 enemy){
        if(enemy.hp <= 0){
            return true;
        }else{
            return false;
        }
    }
}