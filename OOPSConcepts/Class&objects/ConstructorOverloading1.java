import java.util.Scanner;

class Rectangle {
    double length;
    double width;

    // Default constructor
    Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Parameterized constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();

        Rectangle r1 = new Rectangle(l, w);
        Rectangle r2 = new Rectangle(); // default

        System.out.println("Area of rectangle (user input): " + r1.area());
        System.out.println("Area of default rectangle: " + r2.area());
    }
}
