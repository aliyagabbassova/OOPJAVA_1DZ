package org.example.units;
import java.util.ArrayList;
import java.util.Random;
import org.example.Main;

public abstract class Shooter extends BaseHero {        // Стрелок
    int accuracy;
    int ammoReserve;
    int arrows;

    public Shooter(String name, int x, int y, int attack, int initiative, int def, float[] dmg, float hP, int damageMax,int damageMin) {
        super(name, x, y, attack, initiative, def, dmg, hP, damageMax, damageMin);
        this.accuracy = accuracy;
        this.ammoReserve = ammoReserve;
        this.hP = hP;
        this.arrows = arrows;
    }

    @Override
    public void step(ArrayList<BaseHero> heroes, ArrayList<BaseHero> heroes2) {
        if (state.equals("Die") || ammoReserve == 0) return;
        BaseHero victim = heroes2.get(nearest(heroes2).getInit());
        float damage = (victim.def - attack) > 0 ? damageMin : (victim.def - attack) < 0 ? damageMax : (damageMin + damageMax) / 2;
        victim.getDamage(damage);
        for (BaseHero human : heroes) {
            if (human.getInfo().toString().split(":")[0].equals("Фермер") && human.state.equals("Stand")) {
                human.state = "Busy";
                return;
            }
        }
        ammoReserve--;
    }

    //    @Override
//    public void step(ArrayList<BaseHero> enemies, ArrayList <BaseHero> friends) {
//        if (!ifAlive() || !ifArrows()) return;
    //BaseHero victim = heroes2.get(findNearest(heroes2));
//        attack(nearest(enemies).getInit());
//
//        if (!ifPeasant(friends)) ammoReserve -=1;
//    }
    public Boolean ifArrows() {
        return ammoReserve > 0;
    }

    //    public void attack(BaseHero target) {
//        target.hP -= Math.random() * (dmg[1] - dmg[0]) + dmg[0];
//        if (target.hP <= 0) die();
//    }

    public boolean ifPeasant(ArrayList<BaseHero> friends) {

        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getInfo().equals("Я крестьянин!") && (friends.get(i).state.equals("stand"))) {
                friends.get(i).state = "busy";
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hP) +
                " D:" + def +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) +
                " Shots:" + ammoReserve + " " +
                state;
    }
}
