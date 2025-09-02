import java.util.*;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();   // Input number
        sc.close();

        // Find square root
        long sqrt = (long)Math.sqrt(n);

        // Check if square of sqrt equals n
        if (sqrt * sqrt == n) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect Square");
        }
    }
}
