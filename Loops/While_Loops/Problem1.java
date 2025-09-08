import java.util.Scanner;

public class BudgetingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int expense;
        int total = 0;

        // Keep taking inputs until user enters 0
        while (true) {
            expense = sc.nextInt();  // read expense
            if (expense == 0) {
                break;  // stop input
            }
            total += expense;  // add to total
        }

        // Print total expenses
        System.out.println(total);
    }
}
