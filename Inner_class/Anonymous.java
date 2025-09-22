Anonymous Inner Class

A class without a name, created for instant use.

Often used to provide implementation for interfaces or abstract classes.

interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Greeting greet = new Greeting() {  // Anonymous inner class
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };
        greet.sayHello();
    }
}
