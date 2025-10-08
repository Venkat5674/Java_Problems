import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;

    // Parameterized constructor
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rollNumber = sc.nextInt();     // Input roll number
        String name = sc.next();           // Input name
        
        Student s = new Student(rollNumber, name); // Create object using parameterized constructor
        s.displayDetails();                // Display student details
        
        sc.close();
    }
}
