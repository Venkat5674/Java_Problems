import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double marks;
    static int totalStudents = 0; // static variable to count students
    static double totalMarks = 0; // static variable to calculate average

    // Constructor
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        totalStudents++;
        totalMarks += marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }

    // Static method to calculate average marks
    static double averageMarks() {
        if(totalStudents == 0) return 0;
        return totalMarks / totalStudents;
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
            System.out.print("Enter marks: ");
            double marks = sc.nextDouble();
            sc.nextLine(); // consume newline

            students[i] = new Student(name, age, marks);
        }

        System.out.println("\nStudent Details:");
        for(Student s : students){
            s.display();
        }

        System.out.println("\nTotal Students: " + Student.totalStudents);
        System.out.println("Average Marks: " + Student.averageMarks());
    }
}
