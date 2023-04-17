package org.example.units;
import java.util.ArrayList;

public abstract class Shooter extends BaseHero {        // Стрелок
    int accuracy;
    int ammoReserve;
    int arrows;
    String state;

    public Shooter(String name, int x, int y, int attack, int initiative, int def, float[] dmg, float hP, int damageMax, int damageMin) {
        super(name, x, y, attack, initiative, def, dmg, hP, damageMax, damageMin);
        this.accuracy = accuracy;
        this.ammoReserve = ammoReserve;
        this.hP = hP;
        this.arrows = arrows;
    }
    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList <BaseHero> friends) {
        if (!ifAlive() || !ifArrows()) return;
        attack(enemies.get(nearest(enemies)));
        if (!ifPeasant(friends)) ammoReserve -=1;
    }
    public Boolean ifArrows() {
        return ammoReserve > 0;
    }
    public void attack(BaseHero target) {
        target.hP -= Math.random() * (dmg[1] - dmg[0]) + dmg[0];
        if (target.hP <= 0) die();
    }

    public boolean ifPeasant(ArrayList<BaseHero> friends) {
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getInfo().equals("Крестьянин") && (friends.get(i).state.equals("stand"))) {
                friends.get(i).state = "busy";
                return true;
            }
        }
        return false;
    }
}
