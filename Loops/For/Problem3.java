import java.util.Scanner;

public class MultiplesOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int N = sc.nextInt();

        // Constraints: 1 ≤ N ≤ 1000 (reasonable for printing)
        if (N < 1 || N > 1000) {
            System.out.println("Invalid Input");
            return;
        }

        // Generate multiples of 3
        for (int i = 1; i <= N; i++) {
            System.out.print(3 * i);

            // Print space only between numbers
            if (i < N) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
