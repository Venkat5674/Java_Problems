package inheritence_2;

/**
 * Class A1 - Parent class with methods and variables
 */
class A1 {
    int i;
    int j;

    // Parameterized constructor
    public A1(int i, int j) {
        super(); // Implicit call to Object class constructor
        this.i = i;
        this.j = j;
    }

    // No-argument constructor
    public A1() {}

    // Method in parent
    public void m1() {
        System.out.println("m1 method from A1 class");
    }
}
