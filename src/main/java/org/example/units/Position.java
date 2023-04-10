package org.example.units;

public class Position {
    public float distance;
    protected int x;
    protected int y;

    public void position (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public float distance (BaseHero target){
        float dx = Math.abs(x - target.position.x);
        float dy = Math.abs(y - target.position.y);
        return (float) Math.sqrt(dx*dx+dy*dy);}
}
