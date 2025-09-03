import java.util.Scanner;

public class BloodType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Blood Type Information =====");
        System.out.println("1. A+");
        System.out.println("2. A-");
        System.out.println("3. B+");
        System.out.println("4. B-");
        System.out.println("5. AB+");
        System.out.println("6. AB-");
        System.out.println("7. O+");
        System.out.println("8. O-");

        System.out.print("Enter your choice (1-8): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("A+ : Universal Plasma Donor, can receive A+, A-, O+, O-");
                break;
            case 2:
                System.out.println("A- : Can donate to A-, A+, AB-, AB+");
                break;
            case 3:
                System.out.println("B+ : Can donate to B+, AB+");
                break;
            case 4:
                System.out.println("B- : Can donate to B-, B+, AB-, AB+");
                break;
            case 5:
                System.out.println("AB+ : Universal Recipient (can receive all types)");
                break;
            case 6:
                System.out.println("AB- : Can donate to AB- and AB+");
                break;
            case 7:
                System.out.println("O+ : Can donate to O+, A+, B+, AB+");
                break;
            case 8:
                System.out.println("O- : Universal Donor (can donate to all blood types)");
                break;
            default:
                System.out.println("Invalid choice! Please enter 1-8.");
        }

        sc.close();
    }
}
