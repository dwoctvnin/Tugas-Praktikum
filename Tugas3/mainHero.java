package Tugas3;
import java.util.Scanner;

public class mainHero {
 private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        hero hero1 = displayPlayer(1);
        hero hero2 = displayPlayer(2);

        if(hero1.getAtk()==hero2.getDefense() && hero1.getDefense() == hero2.getAtk()){
            System.out.println("ERROR : Masukkan Kembali poin Player 2 yang berbeda dengan Player 1");
            hero2 = new hero();
            hero2 = displayPlayer(2);
        }

        
        int ronde =0, jlhSerangan = 0;
        boolean player1F = (int)(Math.random()*2) == 1 ? true : false;

        while(hero1.getHp() > 0 && hero2.getHp() > 0){
            
            if(jlhSerangan % 2 == 0) {
                System.out.println("============================================");   
                System.out.println("============================================");   
                ronde++;
               System.out.println("Ronde " + ronde);
            }
            if(player1F) hero1.displayPlayer(hero2);
            else hero2.displayPlayer(hero1);

            jlhSerangan++;
        
        }
        if(hero2.getHp() < hero1.getHp()){
            System.out.println("Petarungan Telah Usai!");
            System.out.println(hero2.getName() + " telah kalah!");
            System.out.println("====================================");
            System.out.println(hero1.getName() + " adalah Pemenangnya!");
            System.out.println();
        } else {
            System.out.println("Petarungan Telah Usai!");
            System.out.println(hero1.getName() + " telah kalah!");
            System.out.println("====================================");
            System.out.println(hero2.getName() + " adalah Pemenangnya!");
            System.out.println(); 
        }
        
    }
    public static hero displayPlayer(int playerBrp){
        final int MAX_VALUE = 500;
        hero hero1 = new hero();
        System.out.println("\nPermainan adu hero");
        System.out.println("Silahkan Masukkan Hero Anda");
        System.out.println("Untuk Bagian Angka, Silahkan Masukkan Angka 0 - 500 !");
        System.out.println("==================================");   

        System.out.print("Nama Hero : ");
        String heroName = scanner.nextLine();
        System.out.print("Health Point : ");
        double hp = scanner.nextDouble();
        System.out.print("Attack : ");
        double attack = scanner.nextDouble();
        System.out.print("Defense : ");
        double defense = scanner.nextDouble();
        scanner.nextLine();

        if(hp < 0 || attack > MAX_VALUE || attack < 0 || defense > MAX_VALUE || defense < 0 || hp > MAX_VALUE ){
            System.out.println("ERROR: Silahkan Masukkan angka valid (0-500)!");
            return displayPlayer(playerBrp);
        }
        else{
            if(playerBrp == 1){
                hero1.setName(heroName);
                hero1.setHp(hp);
                hero1.setAtk(attack);
                hero1.setDefense(defense);
            }
        }
        return (playerBrp == 1) ? hero1 : new hero(heroName, hp, attack, defense);
    }
    
}
