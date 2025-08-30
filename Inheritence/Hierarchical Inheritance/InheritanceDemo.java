/**
 * Q4: Hierarchical Inheritance
 * This program demonstrates hierarchical inheritance in Java.
 *
 * a) Explanation of Hierarchical Inheritance:
 *
 * Concept:
 * Hierarchical inheritance is a type of inheritance where one base class
 * (superclass) is extended by multiple child classes (subclasses). All
 * subclasses share the common properties and methods of the single
 * parent class.
 *
 * Real-life Example:
 * A 'Vehicle' class can be a base class. Several other classes like 'Car',
 * 'Bus', and 'Motorcycle' can extend 'Vehicle'. All these child classes
 * share common attributes from the 'Vehicle' class (like speed, color,
 * number of wheels) but also have their own specific features.
 */

// Base class (Superclass)
class Shape {
    // A general method for area, which will be overridden
    public double area() {
        System.out.println("Calculating area of a generic shape...");
        return 0.0;
    }
}

// Child class 1 (Subclass) extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the area() method for Circle
    @Override
    public double area() {
        System.out.println("Calculating area of a Circle...");
        return Math.PI * radius * radius;
    }
}

// Child class 2 (Subclass) extending the same Shape class
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the area() method for Rectangle
    @Override
    public double area() {
        System.out.println("Calculating area of a Rectangle...");
        return length * width;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the Circle class
        Circle myCircle = new Circle(5.0);
        double circleArea = myCircle.area();
        System.out.printf("The area of the circle is: %.2f\n", circleArea);
        System.out.println("-------------------------------------");

        // Create an object of the Rectangle class
        Rectangle myRectangle = new Rectangle(4.0, 6.0);
        double rectangleArea = myRectangle.area();
        System.out.println("The area of the rectangle is: " + rectangleArea);
        System.out.println("-------------------------------------");

        // We can also create a Shape object, though its area() method is generic
        Shape myShape = new Shape();
        double shapeArea = myShape.area();
        System.out.println("The area from the base Shape object is: " + shapeArea);
    }
}
