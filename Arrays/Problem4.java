import java.util.Scanner;

public class WaterUsageAdjustmentClean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // number of stations
        int Q = sc.nextInt(); // number of queries

        int[] usage = new int[N];
        for (int i = 0; i < N; i++) {
            usage[i] = sc.nextInt();
        }

        // Difference array for efficient range updates
        int[] diff = new int[N + 1];

        for (int i = 0; i < Q; i++) {
            int L = sc.nextInt(); // 1-based start index
            int R = sc.nextInt(); // 1-based end index
            int X = sc.nextInt(); // adjustment

            diff[L - 1] += X;      // start applying X from L-1
            if (R < N) diff[R] -= X; // stop applying after R-1
        }

        // Apply difference array and ensure non-negative usage
        int currentAdd = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            currentAdd += diff[i];
            usage[i] += currentAdd;
            if (usage[i] < 0) usage[i] = 0;
            sb.append(usage[i]).append(" ");
        }

        // Print final array
        System.out.println(sb.toString().trim());

        sc.close();
    }
}
