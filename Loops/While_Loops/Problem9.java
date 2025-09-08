import java.util.Scanner;

public class CountMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();
        int K = sc.nextInt();

        int count = 0;
        int i = L;

        // Iterate from L to R
        while (i <= R) {
            if (i % K == 0) {
                count++;
            }
            i++;
        }

        System.out.println(count);
    }
}
