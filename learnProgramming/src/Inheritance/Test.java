package Inheritance;

public class Test {

//    Animal animal = new Animal("SNake", 'y', 'y', 15, 20);
//    Dog germanShepard = new Dog("Tommy", 1, 20, 2,2, 'y', 32, "bread");
//
//    Animal dong = new Dog("Snake", 1, 20, 2,2, 'y', 32, "bread");

    public static void main(String[] args){

//        SuzukiSwift swift = new SuzukiSwift(36);
//        swift.accelerate(30);

//        Circle circle = new Circle(3.75);
//        System.out.println("Radius of circle: "+circle.getRadius());
//        System.out.println("Area of Circle: "+circle.getArea());
//
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//
//        System.out.println("Radius of Cylinder: "+cylinder.getRadius());
//        System.out.println("Height of Cylinder: "+cylinder.getHeight());
//        System.out.println("Area of Cylinder: "+cylinder.getArea());
//        System.out.println("Volume of Cylinder: "+cylinder.getVolume());


        Rectangle rect = new Rectangle(5, 10);
        System.out.println(rect.getWidth());
        System.out.println(rect.getLength());
        System.out.println(rect.getArea());

        Cuboid cub = new Cuboid(5,10, 5);
        System.out.println(cub.getWidth());
        System.out.println(cub.getLength());
        System.out.println(cub.getArea());
        System.out.println(cub.getHeight());
        System.out.println(cub.getVolume());

    }

}
