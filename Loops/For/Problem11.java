import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N < 1 || N > 100) {
            System.out.println("Invalid Input");
            return;
        }

        int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = sc.nextInt();
        }

        int longest = 1; 
        int current = 1; 

        for (int i = 1; i < N; i++) {
            if (prices[i] > prices[i - 1]) {
                current++;
            } else {
                current = 1;
            }
            if (current > longest) {
                longest = current;
            }
        }

        System.out.println(longest);
    }
}
