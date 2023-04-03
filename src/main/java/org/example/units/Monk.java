package org.example.units;

import java.util.ArrayList;

public class Monk extends BaseHero {            // Монах
    int quoinMana, aura; // количество магии, аура
    float backMana; // скорость восстановления маны

    public Monk(String name, int x, int y, int atk, int[] dmg, float hP) {
        super(name, x, y, atk, dmg, hP);
        quoinMana = 100;
        backMana = 1.01F;
        aura = 100;
    }
    @Override
    public String getInfo() {
        return "Я монах!";
    }

    @Override
    public void step(ArrayList<BaseHero> anyHeroes) {

    }
}