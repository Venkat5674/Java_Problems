package abstraction;

public class Calculator implements Calci2 {

    @Override
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    @Override
    public void mult(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    @Override
    public void div(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division by zero not allowed!");
        }
    }
}
