import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i = 1;       // start from 1
        int sum = 0;     // store sum of squares

        while (i <= N) {
            sum += i * i;  // add square of i
            i++;
        }

        System.out.println(sum);
    }
}
