package org.example.units;
import java.util.Random;
import java.util.ArrayList;

public abstract class BaseHero implements GameInterface {
    protected static Random r;
    protected int strength, maxStrength;
    protected Position position;
    protected int initiative;
    protected int def; // броня
    float[] dmg; // урон
    protected int damageMin;
    protected int damageMax;
    protected int attack;
    protected String state;
    protected float hP, maxHp; // здоровье
    public String name; // имя
    public int ammoReserve;

    public BaseHero(String name, int x, int y, int attack, int initiative, int def, float[] dmg, float hP, int damageMax,int damageMin) {
        this.name = getName();
        this.position = new Position(x,y);
        this.attack = attack;
        this.dmg = dmg;
        this.hP = hP;
        this.maxHp = hP;
        this.def = def;
        this.initiative = initiative;
        this.state = "stand";
        this.damageMax = damageMax;
        this.damageMin = damageMin;
    }
    public String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    public Boolean ifAlive() {
        return hP > 0;
    }

     public void die() {
        System.out.println(this.getName() + " " + this.name + " dies a horrible death...");
        this.state = "dead";
    }
    public int getInit() {
        return initiative;
    }

    public float getHp() {
        return hP;
    }

    protected void getDamage(float dmg){
        this.hP -= dmg;
        if (hP <= 0) {
            hP = 0;
            state = "Die";
        }
        if (hP > maxHp) hP = maxHp;
    }
    @Override
    public String toString() {
        return this. getInfo() + " " + getName() +
                " hP:" + Math.round(hP) +
                " D:" + def +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) +
                " Shots:" + ammoReserve + " " +
                state;
    }
    public int nearest(ArrayList<BaseHero> enemyTeam) {
        int index = 0;
        double min = this.position.distance(enemyTeam.get(0));
        for (int i = 1; i < enemyTeam.size(); ++i) {
            if (this.position.distance(enemyTeam.get(i)) < min
                    && (!enemyTeam.get(i).state.equals("Die"))) {
                min = this.position.distance(enemyTeam.get(i));
                index =i;
            }
        }
        return index;
    }

    public int[] position() {

        return new int[]{position.x, position.y};
    }

}

