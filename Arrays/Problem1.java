import java.util.Scanner;

public class MaxSubarrayBruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // size of array
        int Q = sc.nextInt(); // number of queries

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            int L = sc.nextInt(); // 1-based index
            int R = sc.nextInt(); // 1-based index

            int maxSum = Integer.MIN_VALUE;

            // Check all subarrays in range [L-1, R-1]
            for (int start = L - 1; start <= R - 1; start++) {
                int currentSum = 0;
                for (int end = start; end <= R - 1; end++) {
                    currentSum += arr[end];
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                }
            }

            System.out.println(maxSum);
        }

        sc.close();
    }
}
