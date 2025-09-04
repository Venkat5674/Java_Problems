import java.util.Scanner;

class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();  // use long because up to 10^9
        if (n < 1 || n > 1000000000L) {
            System.out.println("Invalid Input");
            return;
        }

        long temp = n;
        int digits = String.valueOf(n).length(); // count digits
        long sum = 0;

        while (temp > 0) {
            long digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
