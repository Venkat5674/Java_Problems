import java.util.Scanner;

public class WaterUsageAdjustmentOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] usage = new int[N];
        for (int i = 0; i < N; i++) {
            usage[i] = sc.nextInt();
        }

        // Difference array
        int[] diff = new int[N + 1];

        for (int i = 0; i < Q; i++) {
            int L = sc.nextInt(); // 1-based index
            int R = sc.nextInt(); // 1-based index
            int X = sc.nextInt();

            diff[L - 1] += X;
            if (R < N) diff[R] -= X; // subtract after R
        }

        // Apply the difference array to original usage
        int currentAdd = 0;
        for (int i = 0; i < N; i++) {
            currentAdd += diff[i];
            usage[i] += currentAdd;
            if (usage[i] < 0) usage[i] = 0; // ensure non-negative
        }

        // Print final array
        for (int i = 0; i < N; i++) {
            System.out.print(usage[i] + (i == N - 1 ? "\n" : " "));
        }

        sc.close();
    }
}
