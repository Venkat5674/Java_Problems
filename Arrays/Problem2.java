import java.util.Scanner;

public class WaterUsageAdjustment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // number of stations
        int Q = sc.nextInt(); // number of queries

        int[] usage = new int[N];
        for (int i = 0; i < N; i++) {
            usage[i] = sc.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            int L = sc.nextInt(); // 1-based index
            int R = sc.nextInt(); // 1-based index
            int X = sc.nextInt(); // adjustment amount

            for (int j = L - 1; j <= R - 1; j++) {
                usage[j] += X;
                if (usage[j] < 0) {
                    usage[j] = 0; // ensure non-negative
                }
            }
        }

        // Print final usage
        for (int i = 0; i < N; i++) {
            System.out.print(usage[i] + (i == N - 1 ? "\n" : " "));
        }

        sc.close();
    }
}
