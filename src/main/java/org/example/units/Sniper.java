package org.example.units;

public class Sniper extends Shooter {           // Снайпер

    int quoinBullets, maxQuoinBullets, accuracy; // количество пуль, макс.кол-во пуль, точность

    float backBullets; // Скорость восстановления запаса пуль

    public Sniper(String name, int x, int y, int def, int[] dmg, float hP) {
        super(name, x, y, def, dmg, hP);
        quoinBullets = maxQuoinBullets = 100;
        accuracy = 95;
        backBullets = 1.01F;
    }

    @Override
    public String getInfo() {
        return "Я снайпер";
    }

    @Override
    public void step() {


    }
}