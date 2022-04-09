package Inheritance;

public class Circle {

    private double radius;

    public Circle(){
        this(0);
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = Math.max(radius, 0);
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
