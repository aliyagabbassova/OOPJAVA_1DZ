package org.example.units;

import java.util.ArrayList;

public class Mage extends BaseHero {            // Маг
    int quoinMana; // количесто маны
    float backMana; // скорость восстановления маны
    public Mage (String name, int x, int y, int atk, int [] dmg, float hP) {
        super (name, x, y, atk, dmg, hP);
        quoinMana = 100;
        backMana = 1.01F;
    }
    @Override
    public String getInfo() {
        return "Я маг!";
    }

    @Override
    public void step(ArrayList<BaseHero> anyHeroes) {

    }
}


