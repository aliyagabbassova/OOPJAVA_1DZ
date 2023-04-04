package org.example.units;
import java.util.ArrayList;
public class NearestEnemy extends Shooter {

    private final org.example.units.Position Position;
    int quoinBullets, maxQuoinBullets, accuracy; // количество пуль, макс.кол-во стрел, точность

    float backBullets; // Скорость восстановления запаса стрел
    int x;
    int y;

    public NearestEnemy(String name, int x, int y, int def, int[] dmg, float hP, org.example.units.Position position) {
        super(name, x, y, def, dmg, hP);
        Position = position;
        quoinBullets = maxQuoinBullets = 100;
        accuracy = 95;
        backBullets = 1.01F;
    }
    public NearestEnemy (Position Position) {
        super(Position.x, Position.y);
        this.Position = Position;
    }
    public void findNearestEnemy(ArrayList<BaseHero> heroes) {
        BaseHero nearest = null;
        double minDistance = Double.MAX_VALUE;

        for (BaseHero hero : heroes) {
            if (hero instanceof BaseHero && hero.isAlive()) {
                double distance = position.distance(BaseHero target);
                if (distance < minDistance) {
                    nearest = hero;
                    minDistance = distance;
                }
            }
        }

        if (nearest != null) {
            System.out.println("Ближайший враг: " + nearest.name);
        } else {
            System.out.println("Врагов не найдено");
        }
    }
}