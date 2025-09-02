import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check positive, negative, or zero
        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println("The number is Zero");
        }

        sc.close();
    }
}
