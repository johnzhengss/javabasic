package daytwo;

public class AssignmentThree {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2,3);
        rectangle.display();
        System.out.println(rectangle.calculateArea());

        System.out.println("-------------------------------");

        Shape circle = new Circle(2);
        circle.display();
        System.out.println(circle.calculateArea());


        System.out.println("-------------------------------");

        Shape triangle = new Triangle(5,3);
        triangle.display();
        System.out.println(triangle.calculateArea());

    }
}

interface Shape{
    public double calculateArea();
    public void display();
}

class Rectangle implements Shape{

    private double len;
    private double width;

    public Rectangle(double len, double width){
        this.len = len;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width*len;
    }

    @Override
    public void display() {
        System.out.println("Rectangle with length: " + len +" width: " + width);
    }
}

class Circle implements Shape{

    final double PI = 3.14;
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI*radius*radius;
    }

    @Override
    public void display() {
        System.out.println("Circle with radius: " + radius);
    }
}

class Triangle implements Shape{

    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base*height)/2;
    }

    @Override
    public void display() {
        System.out.println("Triangle with base: " + base +" height: " + height);
    }
}
