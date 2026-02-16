import L04.Hero.Circle;
import L04.Hero.Hero;
import L04.Latin;

import java.sql.SQLOutput;

public class Main {
    void main(String[] args) {
        Hero hero = new Hero(230);
        System.out.println(hero.getHealth());
        hero.setHealth(99);
        System.out.println("Dexterity is: " + hero.getDexterity());
        Hero hero1 = new Hero();
        hero.hit(hero1,1);
        System.out.println(hero1.getHealth());
        System.out.println(hero.alive());
        hero1.hit(hero,3);
        System.out.println(hero.getDexterity());
        hero.hit(hero1);
        System.out.println(hero1.getHealth());
        if (hero.alive()){
            System.out.println("Alive!");
        }else System.out.println("Dead");
        System.out.println(Latin.M.getNumber());
    }
}



