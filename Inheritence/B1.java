package inheritence_2;

/**
 * Class B1 - Child class extending A1
 */
class B1 extends A1 {
    int i = 1;  // Instance variable of child
    int j = 2;

    // Parameterized constructor
    public B1(int i, int j) {
        super(i, j); // Calls parameterized constructor of A1
    }

    // Method to display variables and call parent methods
    public void display() {
        System.out.println(this.i + "  " + this.j);    // Child class variables
        System.out.println(super.i + "  " + super.j);  // Parent class variables
        super.m1(); // Calls parent class method
    }

    // Overridden method
    @Override
    public void m1() {
        System.out.println("m1 method from B1 class");
    }
}
