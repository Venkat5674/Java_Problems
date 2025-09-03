import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Vending Machine =====");
        System.out.println("1. Coke - ₹40");
        System.out.println("2. Pepsi - ₹35");
        System.out.println("3. Water - ₹20");
        System.out.println("4. Juice - ₹50");
        System.out.println("5. Tea - ₹15");

        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Coke. Please pay ₹40.");
                break;
            case 2:
                System.out.println("You selected Pepsi. Please pay ₹35.");
                break;
            case 3:
                System.out.println("You selected Water. Please pay ₹20.");
                break;
            case 4:
                System.out.println("You selected Juice. Please pay ₹50.");
                break;
            case 5:
                System.out.println("You selected Tea. Please pay ₹15.");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }

        sc.close();
    }
}
