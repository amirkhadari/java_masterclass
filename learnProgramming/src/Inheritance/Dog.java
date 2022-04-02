package Inheritance;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private char tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, double weight, int eyes, int legs, char tail, int teeth, String coat) {
        super(name, 'y', 'y', size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
}
