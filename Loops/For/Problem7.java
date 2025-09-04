import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int N = sc.nextInt();

        // Constraints: 1 ≤ N ≤ 20
        if (N < 1 || N > 20) {
            System.out.println("Invalid Input");
            return;
        }

        int a = 0, b = 1;

        for (int i = 1; i <= N; i++) {
            System.out.print(a);

            // Print space between numbers
            if (i < N) {
                System.out.print(" ");
            }

            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}
