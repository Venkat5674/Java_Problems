import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        long a = sc.nextLong();
        long b = sc.nextLong();

        // Constraints: 1 ≤ a, b ≤ 10^9
        if (a < 1 || b < 1 || a > 1000000000L || b > 1000000000L) {
            System.out.println("Invalid Input");
            return;
        }

        // Euclidean Algorithm using loop
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }

        // Output GCD
        System.out.println(a);

        sc.close();
    }
}
