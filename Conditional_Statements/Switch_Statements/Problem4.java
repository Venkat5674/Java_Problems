import java.util.Scanner;

public class SchoolGradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks (0-100): ");
        int marks = sc.nextInt();
        
        // Convert marks into grade category (by dividing by 10)
        int grade = marks / 10;

        switch (grade) {
            case 10: // 100
            case 9:  // 90-99
                System.out.println("Grade: A");
                break;
            case 8:  // 80-89
                System.out.println("Grade: B");
                break;
            case 7:  // 70-79
                System.out.println("Grade: C");
                break;
            case 6:  // 60-69
                System.out.println("Grade: D");
                break;
            case 5:  // 50-59
                System.out.println("Grade: E");
                break;
            default: // Below 50
                System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}
