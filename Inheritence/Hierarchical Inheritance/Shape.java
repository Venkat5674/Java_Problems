class Shape {
    void area() {
        System.out.println("Area of Shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    @Override
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    @Override
    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.area();
        r.area();
    }
}