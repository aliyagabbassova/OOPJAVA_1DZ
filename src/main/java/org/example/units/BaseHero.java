package org.example.units;
import java.util.Random;

import java.util.ArrayList;
public abstract class BaseHero implements GameInterface {

    protected static Random r;
    protected Position position;
    int def; // координаты, броня
    int[] dmg; // урон
    protected float hP, maxHp; // здоровье
    String name; // имя

    public BaseHero(String name, int x, int y, int def, int[] dmg, float hP) {
        this.name = getName();
        position = new Position(x, y);
        this.dmg = dmg;
        this.hP = hP;
        this.maxHp = hP;
        this.def = def;
    }

    public BaseHero(int x, int y) {
        super();
    }


    public String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    public void step() {

    }

    public Boolean ifAlive() {
        return hP > 0;
    }

    public BaseHero nearest(ArrayList<BaseHero> anyHeroes) {
        int min = 0;
        for (int i = 0; i < anyHeroes.size(); i++) {

        }
        return null;
    }
}

