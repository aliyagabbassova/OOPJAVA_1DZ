package org.example.units;

import java.util.ArrayList;

public class Crossbowman extends Shooter {              //Арбалетчик
    int quoinBolt, maxQuoinBolts, accuracy;             // Стрела арбалета, макс.количество стрел арбалета, точность


    public Crossbowman (String name, int x, int y, int atk, int[] dmg, float hP) {
        super(name, x, y, atk, dmg, hP);
        quoinBolt = maxQuoinBolts = 10;
        accuracy = 70;
        this.hP = hP;
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик!";
    }

    @Override
    public void step(ArrayList<BaseHero> anyHeroes) {
        isAlive();
        System.out.println("Арбалетчик мертв");
        ifArrows();
        System.out.println("У арбалетчика недостаточно стрел");

    }

    protected Boolean ifArrows() {
        return quoinBolt == 0;
    }

    protected Boolean isAlive() {
        return hP == 0;
    }
}