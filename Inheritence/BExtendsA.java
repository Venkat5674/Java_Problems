package inheritence_2;

/**
 * Class B - Child class extending A
 */
class B extends A {

    // Parameterized constructor
    public B(int i, int j) {
        super(); // Calls no-arg constructor of A
    }

    // No-argument constructor
    public B() {
        this(10, 20); // Calls parameterized constructor of B
        System.out.println("No-arg constructor of B");
    }
}
