package inheritence_2;

/**
 * Test3 - Demonstrates Upcasting and Downcasting
 */
public class Test3 {
    public static void main(String[] args) {
        // Example of Upcasting
        Object x = new A2();   // Upcasting: A2 object is referred by Object reference

        // Example of Downcasting
        A2 y = (A2) x;         // Downcasting: Object reference back to A2
        y.m1();
    }
}
