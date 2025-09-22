// Defined inside a method, constructor, or block of the outer class.

// Can access the final or effectively final variables of that scope.
class Outer {
    void outerMethod() {
        String localVar = "Hello from Local Inner Class!";

        class Inner {
            void print() {
                System.out.println(localVar);
            }
        }

        Inner inner = new Inner();
        inner.print();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.outerMethod();
    }
}
