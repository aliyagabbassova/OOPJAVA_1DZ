package org.example.units;

public class Sniper extends Shooter {           // Снайпер
    int quoinBullets, maxQuoinBullets, accuracy; // количество пуль, макс.кол-во пуль, точность
    float backBullets; // Скорость восстановления запаса пуль
    public Sniper(String name, int x, int y, int attack, int initiative, int def, float[] dmg, float hP, int damageMax,int damageMin) {
        super(name, x, y, attack, initiative, def, dmg, hP, damageMax, damageMin);
        quoinBullets = maxQuoinBullets = 100;
        accuracy = 95;
        backBullets = 1.01F;
    }
    @Override
    public String getInfo() {
        return "Я снайпер";
    }

}