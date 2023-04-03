package org.example.units;

import java.util.ArrayList;

public class Peasant extends BaseHero {     // Крестьянин
    int quoinArrows, maxQuoinArrows, quoinBolts, maxQuoinBolts; // количество стрел, максимальное количество стрел, количество болтов
    // максимальное количество болтов
    float backAmmo; // скорость восстановления боеприпаса

    public Peasant(String name, int x, int y, int atk, int[] dmg, float hP) {
        super(name, x, y, atk, dmg, hP);
        quoinArrows = maxQuoinArrows = quoinBolts = maxQuoinBolts = 10;
        backAmmo = 1.01F;
    }
    @Override
    public String getInfo() {
        return "Я крестьянин!";
    }

    @Override
    public void step(ArrayList<BaseHero> anyHeroes) {

    }

    @Override
    public void step() {

    }
}
