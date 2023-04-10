package org.example.units;

public class Spearman extends Shooter {         // Копьеносец
    int accuracy; // точность удара
    int quoinSpears, maxQuoinSpears; // количество копий, максимальное количество копий
    float backSpears; // скорость восстановления запаса копий
    public Spearman(String name, int x, int y, int attack, int initiative, int def, float[] dmg, float hP, int damageMax,int damageMin) {
        super(name, x, y, attack, initiative, def, dmg, hP, damageMax, damageMin);
        accuracy = 30;
        quoinSpears = maxQuoinSpears = 10;
        backSpears = 1.01F;
    }
    @Override
    public String getInfo() {

        return "Я Копьеносец!";
    }

}
