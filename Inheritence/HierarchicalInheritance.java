// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

// Child class 1
class Circle extends Shape {
    void area() {
        System.out.println("Area of circle = πr²");
    }
}

// Child class 2
class Rectangle extends Shape {
    void area() {
        System.out.println("Area of rectangle = l × b");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.area();

        Rectangle r = new Rectangle();
        r.draw();
        r.area();
    }
}
