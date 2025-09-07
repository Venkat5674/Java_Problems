class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects using constructor
        Student s1 = new Student("Venkatesh", 21);
        Student s2 = new Student("Sai", 19);

        s1.display();
        s2.display();
    }
}
