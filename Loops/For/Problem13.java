import java.util.Scanner;

class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N < 2 || N > 1000) {
            System.out.println("Invalid Input");
            return;
        }

        int sum = 0;
        for (int num = 2; num <= N; num++) {
            if (isPrime(num)) {
                sum += num;
            }
        }

        System.out.println(sum);
    }

    // Function to check if a number is prime
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
