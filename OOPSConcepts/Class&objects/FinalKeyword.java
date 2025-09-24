import java.util.Scanner;

class Circle {
    final double PI = 3.14159; // final variable
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        System.out.println("Area of circle: " + c.area());
    }
}
