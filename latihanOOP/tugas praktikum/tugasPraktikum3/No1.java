/**
 * No1
 */
public class No1 {
    private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;
    private int money;
    private Item1 items[];

public String getName() {
	return this.name;
}
public void setName(String name) {
	this.name = name;
}


    public String getRole() {
    	return this.role;
    }
    public void setRole(String role) {
    	this.role = role;
    }


    public int getLevel() {
    	return this.level;
    }
    public void setLevel(int level) {
    	this.level = level;
    }


    public double getDamage() {
    	return this.damage;
    }
    public void setDamage(double damage) {
    	this.damage = damage;
    }


    public double getHp() {
    	return this.hp;
    }
    public void setHp(double hp) {
    	this.hp = hp;
    }


    public double getEnergy() {
    	return this.energy;
    }
    public void setEnergy(double energy) {
    	this.energy = energy;
    }


    public int getMoney() {
    	return this.money;
    }
    public void setMoney(int money) {
    	this.money = money;
    }


    public Item1[] getItems() {
    	return this.items;
    }

    /**
     * InnerNo1
     */
    public class Item1 {
        private String name;
        private int price;
        private String info;
        
        public Item1(String name, int price, String info){
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
        public String getInfo(){
            return info;
        }

        public void use(){
            //code
        }
        public void sell(){
            //code
        }
        public void destroy(){
            //code
        }
        
        
    }
    
    

    
}