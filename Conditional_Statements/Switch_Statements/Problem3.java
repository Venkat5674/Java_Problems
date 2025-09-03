import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Traffic Light System =====");
        System.out.println("1. Red");
        System.out.println("2. Yellow");
        System.out.println("3. Green");

        System.out.print("Enter your choice (1-3): ");
        int light = sc.nextInt();

        switch (light) {
            case 1:
                System.out.println("Red Light - STOP!");
                break;
            case 2:
                System.out.println("Yellow Light - GET READY!");
                break;
            case 3:
                System.out.println("Green Light - GO!");
                break;
            default:
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }

        sc.close();
    }
}
