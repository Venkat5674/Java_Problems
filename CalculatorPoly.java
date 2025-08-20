import java.util.Scanner;

class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Add int and double
    double add(int a, double b) {
        return a + b;
    }

    // Add double and int
    double add(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum of two integers: " + calc.add(x, y));

        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Sum of three integers: " + calc.add(a, b, c));

        System.out.print("Enter two doubles: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Sum of two doubles: " + calc.add(d1, d2));

        System.out.print("Enter int and double: ");
        int i = sc.nextInt();
        double d = sc.nextDouble();
        System.out.println("Sum of int and double: " + calc.add(i, d));
    }
}
