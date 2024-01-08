abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

        Shape circle = new Circle(3);
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}
