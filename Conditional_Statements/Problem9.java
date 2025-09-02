import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three side lengths
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Classify the triangle
        if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }

        sc.close();
    }
}
