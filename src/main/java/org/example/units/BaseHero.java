package org.example.units;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
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

    public BaseHero(String name, int x, int y, int attack, int initiative, int def, float[] dmg, float hP, int damageMax,int damageMin) {
        this.name = getName();
        this.position = position;
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

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> friends) {
    }

    public Boolean ifAlive() {
        return hP > 0;
    }

    public BaseHero nearest(ArrayList<BaseHero> otherHeroes) {
        float min = 10;
        BaseHero nearestHero = null;
        for (int i = 0; i < otherHeroes.size(); i++) {
            if (this.position.distance(otherHeroes.get(i)) < min) ;
            nearestHero = otherHeroes.get(i);
        }
        return nearestHero;
    }
    public void die() {
        System.out.println(this.getInfo() + " " + this.name + " dies a horrible death...");
        this.state = "dead";
    }

    public int getInit() {
        return initiative;
    }

    public float getHp() {
        return hP;
    }

    @Override
    public String toString() {
        return String.valueOf(hP);
    }

//    protected void getDamage(float damage) {
//            System.out.println(this.getInfo() + " " + this.name + " gets " + Math.min(dmg, this.hP) + " str dmg");
//            this.hP -= Math.min(dmg, this.hP);
//            if (hP == 0) this.die();

    protected void getDamage(float dmg){
        this.hP -= dmg;
        if (hP <= 0) {
            hP = 0;
            state = "Die";
        }
        if (hP > maxHp) hP = maxHp;
    }
    }

