package org.example.units;

public class Spearman extends Shooter {         // Копьеносец
    int accuracy; // точность удара
    int quoinSpears, maxQuoinSpears; // количество копий, максимальное количество копий
    float backSpears; // скорость восстановления запаса копий
    public Spearman(String name, int x, int y, int atk, int[] dmg, float hP) {
        super(name, x, y, atk, dmg, hP);
        accuracy = 30;
        quoinSpears = maxQuoinSpears = 10;
        backSpears = 1.01F;
    }
    @Override
    public String getInfo() {

        return "Я Копьеносец!";
    }

}
