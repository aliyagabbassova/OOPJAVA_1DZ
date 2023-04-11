package org.example.units;
import java.util.ArrayList;

public interface GameInterface  {

    String  getInfo ();

    void step(ArrayList <BaseHero> enemies, ArrayList <BaseHero> friends);



}
