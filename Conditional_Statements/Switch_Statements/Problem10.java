import java.util.Scanner;

public class MovieTheater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        int rateCategory; 

        // Divide age into categories
        if (age < 5) {
            rateCategory = 1; // Infant
        } else if (age >= 5 && age <= 12) {
            rateCategory = 2; // Child
        } else if (age >= 13 && age <= 18) {
            rateCategory = 3; // Teen
        } else if (age >= 19 && age <= 60) {
            rateCategory = 4; // Adult
        } else {
            rateCategory = 5; // Senior Citizen
        }

        switch (rateCategory) {
            case 1:
                System.out.println("Ticket is FREE for age below 5.");
                break;
            case 2:
                System.out.println("Child Ticket: ₹100");
                break;
            case 3:
                System.out.println("Teen Ticket: ₹150");
                break;
            case 4:
                System.out.println("Adult Ticket: ₹200");
                break;
            case 5:
                System.out.println("Senior Citizen Ticket: ₹120");
                break;
            default:
                System.out.println("Invalid age!");
        }

        sc.close();
    }
}
