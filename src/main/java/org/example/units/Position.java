package org.example.units;

public class Position {
    protected int x, y;

    public Position (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public float distance (BaseHero target){
        float dx = Math.abs(x - target.position.x);
        float dy = Math.abs(y - target.position.y);
        return (float) Math.sqrt(dx*dx+dy*dy);}


}
