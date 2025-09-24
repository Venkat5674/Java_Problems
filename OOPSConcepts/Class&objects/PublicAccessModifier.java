package p1;

public class A {
    public void fun() {
        System.out.println("Hello from Public");
    }
}

package p2;

import p1.*;

class B {
    public static void main(String[] args) {
        A a = new A();
        a.fun(); // Allowed as fun() is public
    }
}
