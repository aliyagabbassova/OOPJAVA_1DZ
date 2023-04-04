package org.example.units;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero {        // Стрелок
    int accuracy;
    int ammoReserve;
    int arrows;

    public Shooter(String name, int x, int y, int def, int[] dmg, float hP) {
        super(name, x, y, def, dmg, hP);
        this.accuracy = accuracy;
        this.ammoReserve = ammoReserve;
        this.hP = hP;
        this.arrows = arrows;
    }

    public Shooter(int x, int y) {
        super(x,y);
    }

    @Override
    public String getInfo() {
        return "Я стрелок";
    }

    @Override
    public void step(ArrayList<BaseHero> anyHeroes) {
        isAlive();
        System.out.println("Стрелок мертв");
        ifArrows();
        System.out.println("У стрелка нет стрел");

    }

    protected Boolean ifArrows() {
        return ammoReserve == 0;
    }

    protected Boolean isAlive() {
        return hP == 0;
    }
}