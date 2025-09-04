import java.util.Scanner;

public class EvenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N
        int N = sc.nextInt();

        // Constraints: 1 ≤ N ≤ 100
        if (N < 1 || N > 100) {
            System.out.println("Invalid Input");
            return;
        }

        int count = 0;

        // Read N scores
        for (int i = 0; i < N; i++) {
            int score = sc.nextInt();

            // Check parity (even number)
            if (score % 2 == 0) {
                count++;
            }
        }

        // Output the count of even numbers
        System.out.println(count);

        sc.close();
    }
}
