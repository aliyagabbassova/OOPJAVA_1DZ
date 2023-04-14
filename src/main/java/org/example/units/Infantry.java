package org.example.units;

import java.util.ArrayList;

public class Infantry extends BaseHero {
    int accuracy;
    String state;

    public Infantry(String name, int x, int y, int attack, int initiative, int def, float[] dmg, float hP, int damageMax, int damageMin) {
        super(name, x, y, attack, initiative, def, dmg, hP, damageMax, damageMin);
        this.accuracy = accuracy;
    }

    @Override
    public String getInfo() {
        return null;
    }

    public void attack(BaseHero target) {
        target.hP -= Math.random() * (dmg[1] - dmg[0]) + dmg[0];
        if (target.hP <= 0) die();
    }

    public boolean ifFriendOnTheWay(ArrayList<BaseHero> enemies) {
        for (int i = 0; i < enemies.size(); i++) {
            if (this.position() == enemies.get(i).position()) return true;
        }
        return false;
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> friends) {
        if (!ifAlive()) return;
         BaseHero target = enemies.get(nearest(enemies));
        if (position.distance(target) < 2) {
            attack(target);
        } else if (Math.abs(position.direction(target)[0]) >
                Math.abs(position.direction(target)[1]) && (ifFriendOnTheWay(friends))) {
            position.x += Math.signum(position.direction(target)[0]);
        } else if (Math.abs(position.direction(target)[0]) < Math.abs(position.direction(target)[1])
                && (ifFriendOnTheWay(friends))) {
            position.y += Math.signum(position.direction(target)[1]);
        }
    }
}

