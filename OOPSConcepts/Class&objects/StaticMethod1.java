import java.util.Scanner;

class Calculator {
    // Static method for addition
    static int add(int a, int b) {
        return a + b;
    }

    // Static method for multiplication
    static int multiply(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("Sum: " + Calculator.add(x, y));
        System.out.println("Product: " + Calculator.multiply(x, y));
    }
}
