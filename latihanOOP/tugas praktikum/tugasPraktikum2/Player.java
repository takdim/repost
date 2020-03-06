public class Player{
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    public Player (String name, int defense){
        this.name = name;
        this.defense = defense;
        hp = 100;
    }
    //lengkapi
    public Player (String name, int attack, int defense){
        this.name = name;
        attackPower = attack;
        this.defense = defense;
        hp = 100;
    }
    // public int PDamage(Player enemy){
    //     int darah = 0;
    //     if(defense - enemy.getAttackPower() >= 0 ){
    //        darah = (defense - enemy.getAttackPower());
    //     }else if(defense - enemy.getAttackPower() < 0){
    //        darah = -1*(defense - enemy.getAttackPower());
    //     }
    //     return darah;
    // }
    
    public void getDamage(Player enemy){
        //hp = hp - PDamage(enemy);
        if(defense < enemy.getAttackPower()){
            hp = hp - Math.abs(defense - enemy.getAttackPower());
        }
    }
    public void status(){
        System.out.println(name + " status");
        if(hp < 0){
            System.out.println("mati");
        }else{

            System.out.println("Hp = " + hp);
        }
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower);
        System.out.println();
    }
    //lengkapi
    public void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }
    public int getAttackPower(){
        return attackPower;
    }

    public static void main(String[] args) {
        int defense = 0;
        int attack = 0;
        //int attack2 = 35;
        Player player1 = new Player("Mino", attack, defense);
        Player player2 = new Player("Hilda", defense);

        
        player2.setAttackPower(0);

        player1.getDamage(player2);
        player2.getDamage(player1);
        player1.status();
        player2.status();


    }
} 