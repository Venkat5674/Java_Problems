import java.util.Scanner;

public class EvenTransactionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N
        int N = sc.nextInt();

        // Constraints: 1 ≤ N ≤ 100
        if (N < 1 || N > 100) {
            System.out.println("Invalid Input");
            return;
        }

        int sum = 0;

        // Read N transactions
        for (int i = 0; i < N; i++) {
            int amount = sc.nextInt();

            // Check if amount is even
            if (amount % 2 == 0) {
                sum += amount;
            }
        }

        // Output the total of even transactions
        System.out.println(sum);

        sc.close();
    }
}
