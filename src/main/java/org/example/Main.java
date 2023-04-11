package org.example;
import org.example.units.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static ArrayList<BaseHero> heroes = new ArrayList<>();
    public static ArrayList<BaseHero> heroes2 = new ArrayList<>();
    public static ArrayList<BaseHero> unitedTeams = new ArrayList<>();
    private static Scanner myScanner = new Scanner(System.in);
    public Position position;

    public static void main(String[] args) {
        unitedTeams();
        Scanner input = new Scanner(System.in);
        while (true) {
            unitedTeams = sortTeam();
            View.view();  // отображение в консоль
            input.nextLine();
            for (BaseHero human : unitedTeams) {
                if (heroes.contains(human)) human.step(heroes, heroes2);
                else human.step(heroes, heroes2);
            }
        }
    }

    private static ArrayList<BaseHero> sortTeam() {
        ArrayList<BaseHero> list = new ArrayList<>();
        list.addAll(heroes);
        list.addAll(heroes2);
        list.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero t0, BaseHero t1) {
                if (t1.getInit() == t0.getInit()) return (int) (t1.getHp() - t0.getHp());
                else return (int) (t1.getInit() - t0.getInit());
            }
        });
        return list;
    }

    private static ArrayList<BaseHero> unitedTeams() {
        //ArrayList<BaseHero> heroes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    heroes.add(new Crossbowman("Святополк", 0, i, 20, 7, 10, new float[]{12, 20}, 100, 20, 12));
                    break;
                case 1:
                    heroes.add(new Mage("Коловрат", 0, i, 0, 5, 2, new float[]{5, 6}, 100, 6, 5));
                    break;

                case 2:
                    heroes.add(new Peasant("Пересвет", 0, i, 0, 3, 2, new float[]{3, 7}, 100, 7, 3));
                    break;

                case 3:
                    heroes.add(new Thief("Хитроум", 0, i, 0, 6, 6, new float[]{5, 10}, 100, 10, 5));
                    break;
            }
        }
        for (int j = 0; j < 10; j++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    heroes2.add(new Monk("Мирослав", 8, j, 0, 5, 3, new float[]{8, 10}, 100, 10, 5));
                    break;
                case 1:
                    heroes2.add(new Peasant("Иритель", 8, j, 0, 3, 4, new float[]{3, 7}, 100, 15, 5 ));
                    break;
                case 2:
                    heroes2.add(new Sniper("Зоркомёт", 8, j, 20, 8, 10, new float[]{10, 18}, 100, 18,10));
                    break;
                default:
                    heroes2.add(new Spearman("<Бронеслав", 8, j, 20, 7, 10, new float[]{12, 20}, 100, 20, 12));
            }
        }
        return unitedTeams;
    }
}

