package inheritence_2;

/**
 * Class A - Parent class with constructors
 */
class A {
    int i;
    int j;

    // Parameterized constructor
    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    // No-argument constructor
    public A() {
        System.out.println("No-arg constructor of A");
    }
}
