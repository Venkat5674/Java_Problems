import java.util.Scanner;

public class WeekdayWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        // Check weekday/weekend
        if (day >= 1 && day <= 5) {
            System.out.println("It's a Weekday");
        } else if (day == 6 || day == 7) {
            System.out.println("It's a Weekend");
        } else {
            System.out.println("Invalid day number! Please enter 1-7.");
        }

        sc.close();
    }
}
