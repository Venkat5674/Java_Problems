import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        long N = sc.nextLong();  // use long since N can be up to 10^9

        // Constraints: 0 ≤ N ≤ 10^9
        if (N < 0 || N > 1000000000L) {
            System.out.println("Invalid Input");
            return;
        }

        int sum = 0;

        // Loop to extract digits and add them
        while (N > 0) {
            sum += N % 10;  // last digit
            N /= 10;        // remove last digit
        }

        // Output result
        System.out.println(sum);

        sc.close();
    }
}
