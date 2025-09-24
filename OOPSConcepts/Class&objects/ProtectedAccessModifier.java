package p1;

public class A {
    protected void fun() {
        System.out.println("Hello from Protected");
    }
}

package p2;

import p1.*;

class B extends A {
    public static void main(String[] args) {
        B b = new B();
        b.fun(); // Allowed as B inherits from A
    }
}
