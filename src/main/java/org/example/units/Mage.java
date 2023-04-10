package org.example.units;

public class Mage extends BaseHero {
    int quoinMana; // количесто маны
    float backMana; // скорость восстановления маны
    public Mage (String name, int x, int y, int attack, int initiative, int def, float[] dmg, float hP, int damageMax,int damageMin) {
        super(name, x, y, attack, initiative, def, dmg, hP, damageMax, damageMin);
        quoinMana = 100;
        backMana = 1.01F;
    }
    @Override
    public String getInfo() {
        return "Я маг!";
    }
}
