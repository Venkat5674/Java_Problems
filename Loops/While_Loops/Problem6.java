import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i = 1;
        int sum = 0;

        // Check every number from 1 to N
        while (i <= N) {
            if (N % i == 0) {   // if i divides N
                sum += i;       // add divisor
            }
            i++;
        }

        System.out.println(sum);
    }
}
