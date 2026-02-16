package L04.Hero;


public class Hero {
    final static int INITIAL_HEALTH = 100;
    final static int INITIAL_INTELLIGENCE = 100;
    private int health;
    final private int dexterity;
    private int intelligence;

    public Hero(int dexterity) {
        this.dexterity = dexterity % 100;
        health = INITIAL_HEALTH;
        intelligence = INITIAL_INTELLIGENCE;
        intelligence = intelligence - this.dexterity;
    }

    public Hero() {
        health = INITIAL_HEALTH;
        dexterity = 35;
        intelligence = 50;
    }

    public int getHealth(){
        return health;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int hit(Hero hero,int count){
        hero.health -= this.dexterity*count;
        return this.dexterity*count;
    }
    public int hit(Hero hero){
        hero.health -= this.dexterity;
        return this.dexterity;
    }

    public boolean alive(){
        return this.health > 0;
    }


}
