import java.util.Scanner;

public class SmallestPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int K = sc.nextInt();

        long power = 1; // K^0 = 1
        int i = 0;

        while (power < N) {
            power *= K;
            i++;
        }

        System.out.println(i);
    }
}
