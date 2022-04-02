package Inheritance;

public class Vehicle {

    private String color;
    private int tyres;
    private int headLight;
    private int sideMirrors;
    private int cc;
    private int gears;

    public Vehicle() {
        this("White", 2, 1, 2, 100, 4);

    }

    public Vehicle(String color, int tyres, int headLight, int sideMirrors, int cc, int gears) {
        this.color = color;
        this.tyres = tyres;
        this.headLight = headLight;
        this.sideMirrors = sideMirrors;
        this.cc = cc;
        this.gears = gears;
    }

    public String getColor() {
        return color;
    }

    public int getTyres() {
        return tyres;
    }

    public int getHeadLight() {
        return headLight;
    }

    public int getSideMirrors() {
        return sideMirrors;
    }

    public int getCc() {
        return cc;
    }

    public int getGears() {
        return gears;
    }
}
