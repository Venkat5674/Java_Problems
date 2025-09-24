package p1;

class A {
    void fun() {
        System.out.println("Hello from Default");
    }
}

package p2;

import p1.*;

class B {
    public static void main(String[] args) {
        A a = new A();
        // Compiler error: fun() has default access and is not visible outside p1
        // a.fun(); // Uncommenting this line will cause a compilation error
    }
}
