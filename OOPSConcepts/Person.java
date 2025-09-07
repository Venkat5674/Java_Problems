// Class = Blueprint
class Person {
    String name;   // property
    int age;       // property
}

public class Main {
    public static void main(String[] args) {
        // Object creation
        Person p1 = new Person();

        // Assign values
        p1.name = "Venkatesh";
        p1.age = 21;

        // Print values
        System.out.println(p1.name);
        System.out.println(p1.age);
    }
}
