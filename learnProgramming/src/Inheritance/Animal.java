package Inheritance;

public class Animal {

    private String name;
    private char brain;
    private char body;
    private int size;
    private double weight;

    public Animal(){
        this("Test", 'Y', 'Y', 12, 189.67);
    }

    public Animal(String name, char brain, char body, int size, double weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Eat Method is calling from Animal Class");
    }

    public void move(){
        System.out.println("Move Method is calling from Animal Class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getBrain() {
        return brain;
    }

    public void setBrain(char brain) {
        this.brain = brain;
    }

    public char getBody() {
        return body;
    }

    public void setBody(char body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
