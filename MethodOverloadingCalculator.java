**
 * Q1: Method Overloading
 * This program demonstrates method overloading in Java.
 *
 * a) Explanation of Method Overloading:
 *
 * What it is?
 * Method overloading is a feature in Java that allows a class to have more
 * than one method with the same name, as long as their parameter lists are
 * different. The difference can be in the number of parameters, the data type
 * of parameters, or both.
 *
 * Why it is used?
 * It increases the readability of the program. Programmers don't have to
 * remember different names for methods that perform similar actions. For
 * example, instead of having addInts(), addDoubles(), addThreeInts(), we can
 * simply have multiple add() methods.
 *
 * Rules of Method Overloading:
 * 1. Methods must have the same name.
 * 2. Methods must have different parameter lists (either number, type, or order of parameters).
 * 3. The return type can be the same or different, but the return type alone is
 * not sufficient to overload a method.
 * 4. Access modifiers can be the same or different.
 */
class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers...");
        return a + b;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        System.out.println("Adding two doubles...");
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers...");
        return a + b + c;
    }
}

public class MethodOverloadingCalculator {
    public static void main(String[] args) {
        // Create a Calculator object
        Calculator myCalculator = new Calculator();

        // Test the add(int a, int b) method
        int sum1 = myCalculator.add(10, 20);
        System.out.println("Sum of 10 and 20 is: " + sum1);
        System.out.println("---------------------------------");


        // Test the add(double a, double b) method
        double sum2 = myCalculator.add(5.5, 4.5);
        System.out.println("Sum of 5.5 and 4.5 is: " + sum2);
        System.out.println("---------------------------------");

        // Test the add(int a, int b, int c) method
        int sum3 = myCalculator.add(5, 10, 15);
        System.out.println("Sum of 5, 10, and 15 is: " + sum3);
        System.out.println("---------------------------------");
    }
}
