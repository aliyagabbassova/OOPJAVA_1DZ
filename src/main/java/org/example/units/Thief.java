package org.example.units;

import java.util.ArrayList;

public class Thief extends BaseHero {       // Вор
    boolean stealth, magicResistance; // скрытность, сопротивляемость магии
    int timeStealth, timeResistance; // время скрытности, время сопротивления магии


    public Thief(String name, int x, int y, int attack, int initiative, int def, float[] dmg, float hP, int damageMax,int damageMin) {
        super(name, x, y, attack, initiative, def, dmg, hP, damageMax, damageMin);
        timeStealth = timeResistance = 60;
        stealth =  magicResistance = false;
    }
    @Override
    public String getInfo() {
        return "Я вор!";
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList <BaseHero> friends) {
    }
}
