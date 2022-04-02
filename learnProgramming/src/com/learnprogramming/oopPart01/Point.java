package com.learnprogramming.oopPart01;

public class Point {

    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double distance(){
        return Math.sqrt(((this.x)*(this.x))+((this.y)*(this.y)));
    }

    public double distance(int x1, int y1){
        return Math.sqrt(((x1-getX())*(x1-getX()))+((y1-getY())*(y1-getY())));
    }

    public double distance(Point p){
        return distance(p.x,p.y);
    }
    
}
