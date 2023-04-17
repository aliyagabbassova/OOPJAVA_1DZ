package org.example.units;

import java.util.ArrayList;

public class Mage extends BaseHero {
    int quoinMana; // количесто маны
    float backMana; // скорость восстановления маны
    public Mage (String name, int x, int y, int attack, int initiative, int def, float[] dmg, float hP, int damageMax,int damageMin) {
        super(name, x, y, attack, initiative, def, dmg, hP, damageMax, damageMin);
        quoinMana = 100;
        backMana = 1.01F;
    }
    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        for (BaseHero human: team1) {
            if (human.hP < human.maxHp & !human.state.equals("Die")) {
                human.getDamage(damageMax);
                return;
            }
        }
    }

//    protected void getTreat(float dmg){
//            if (hP <= 0) {
//            hP = 0;
//            state = "Die";
//        }
//        if (hP < 30) this.hP += dmg/2;
//    }
    @Override
    public String getInfo() {
        return "Маг";
    }
}
