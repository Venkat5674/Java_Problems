import java.util.Scanner;

class Student {
    String name;
    int age;
    static int count = 0; // static variable

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++; // increment count whenever a new object is created
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline

            students[i] = new Student(name, age);
        }

        System.out.println("\nStudent Details:");
        for(Student s : students){
            s.display();
        }

        System.out.println("Total Students: " + Student.count);
    }
}
