package Tugas3;

public class hero {
    private String name;
    private double hp;
    private double atk;
    private double defense;
    
    public hero(String name, double hp, double atk, double defense){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.defense = defense;
    }
    public hero(){

    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHp(double hp) {
        this.hp = hp;
    }
    public void setAtk(double atk) {
        this.atk = atk;
    }
    public void setDefense(double defense) {
        this.defense = defense;
    }
    public String getName() {
        return name;
    }
    public double getHp() {
        return hp;
    }
    public double getAtk() {
        return atk;
    }
    public double getDefense() {
        return defense;
    }
    
    public void displayPlayer(hero hero2){
        System.out.println(hero2.getName() + "menyerang " + this.getName());
        System.out.println();
        System.out.println(this.getName() + "menyerang sebesar " + Double.toString(this.getAtk()));
        System.out.println(hero2.getName() + "memiliki pertahanan sebesar " +Double.toString(hero2.getDefense()));
        if(hero2.getDefense() > this.getAtk()) hero2.setHp(hero2.getHp());
        else hero2.setHp(hero2.getHp() - (this.getAtk() - hero2.getDefense()));
        
        if(this.hp < 0) this.hp = 0;
        if(hero2.getHp() < 0) hero2.setHp(0);
        System.out.println("Health " + hero2.getName() + "saat ini " + Double.toString(hero2.getHp()));
        System.out.println();
    }
}
    

