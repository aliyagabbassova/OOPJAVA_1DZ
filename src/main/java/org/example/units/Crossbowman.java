package org.example.units;
import java.util.ArrayList;

public class Crossbowman extends Shooter {              //Арбалетчик
    int quoinBolt, maxQuoinBolts, accuracy;             // Стрела арбалета, макс.количество стрел арбалета, точность

        public Crossbowman (String name, int x, int y, int attack, int initiative, int def, float[] dmg, float hP, int damageMax,int damageMin) {
            super(name, x, y, attack, initiative, def, dmg, hP, damageMax, damageMin);
            quoinBolt = maxQuoinBolts = 10;
            accuracy = 70;
        }
        @Override
        public String getInfo() {
            return "Арбалетчик";
        }


    }
