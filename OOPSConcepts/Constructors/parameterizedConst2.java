import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private int gradeLevel;

    // Parameterized constructor with validation
    public Student(String name, int rollNumber, int gradeLevel) throws Exception {
        if (name == null || name.trim().isEmpty()) {
            throw new Exception("Name cannot be empty");
        }
        if (rollNumber <= 0) {
            throw new Exception("Roll number must be positive");
        }
        if (gradeLevel < 1 || gradeLevel > 12) {
            throw new Exception("Grade level must be between 1 and 12");
        }

        this.name = name;
        this.rollNumber = rollNumber;
        this.gradeLevel = gradeLevel;
    }

    // Method to display student details
    public void showProfile() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + gradeLevel);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String name = sc.nextLine();     // Read name (can include spaces)
            int rollNumber = sc.nextInt();   // Read roll number
            int gradeLevel = sc.nextInt();   // Read grade level

            Student s = new Student(name, rollNumber, gradeLevel); // Create object
            s.showProfile();                 // Display details
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
