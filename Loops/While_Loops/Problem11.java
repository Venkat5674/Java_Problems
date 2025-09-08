import java.util.Scanner;

public class NumerologyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Keep reducing until single digit
        while (N >= 10) {
            int sum = 0;
            while (N > 0) {
                sum += N % 10;  // extract last digit
                N /= 10;        // remove last digit
            }
            N = sum; // update N to the digit sum
        }

        System.out.println(N);
    }
}
