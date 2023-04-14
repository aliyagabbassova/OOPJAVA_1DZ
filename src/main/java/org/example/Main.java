package org.example;
import org.example.units.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
            Teams.createTeam1();
            Teams.createTeam2();
            Teams.getUnitedTeams(Teams.heroes, Teams.heroes2);
            Teams.cmp(Teams.unitedTeams);

            Scanner console = new Scanner(System.in);
            System.out.print("Press Enter to begin.");
            String action = console.nextLine();


            while (true) {
                View.view();
                console.nextLine();
                Teams.stepTeam(Teams.unitedTeams);



            }
        }
    }




