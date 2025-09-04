import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int N = sc.nextInt();

        // Constraints: 1 ≤ N ≤ 1000
        if (N < 1 || N > 1000) {
            System.out.println("Invalid Input");
            return;
        }

        // Compute sum using a loop
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        // Output
        System.out.println(sum);

        sc.close();
    }
}
