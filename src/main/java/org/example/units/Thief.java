package org.example.units;

import java.util.ArrayList;

public class Thief extends BaseHero {       // Вор
    boolean stealth, magicResistance; // скрытность, сопротивляемость магии
    int timeStealth, timeResistance; // время скрытности, время сопротивления магии


    public Thief(String name, int x, int y, int atk, int[] dmg, float hP) {
        super(name, x, y, atk, dmg, hP);
        timeStealth = timeResistance = 60;
        stealth =  magicResistance = false;
    }
    @Override
    public String getInfo() {
        return "Я вор!";
    }

    @Override
    public void step(ArrayList<BaseHero> anyHeroes) {

    }

    @Override
    public void step(){


    }
}
