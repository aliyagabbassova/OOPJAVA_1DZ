package org.example.units;
import java.util.ArrayList;

    public class Monk extends BaseHero {            // Монах
    int quoinMana, aura; // количество магии, аура
    float backMana; // скорость восстановления маны

    public Monk(String name, int x, int y, int attack, int initiative, int def, float[] dmg, float hP, int damageMax,int damageMin) {
        super(name, x, y, attack, initiative, def, dmg, hP, damageMax, damageMin);
        quoinMana = 100;
        backMana = 1.01F;
        aura = 100;
    }
    @Override
    public String getInfo() {
        return "Монах";
    }

        @Override
        public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> friends) {

        }
    }