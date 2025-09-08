import java.util.Scanner;

public class SumOfEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;
        int i = 2;  // start from the first even number

        while (i <= N) {
            sum += i;
            i += 2;  // move to the next even number
        }

        System.out.println(sum);
    }
}
