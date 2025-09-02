import java.util.Scanner;

public class AgeClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Classification logic
        if (age >= 0 && age <= 12) {
            System.out.println("You are a Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teen");
        } else if (age >= 20) {
            System.out.println("You are an Adult");
        } else {
            System.out.println("Invalid age entered");
        }

        sc.close();
    }
}
