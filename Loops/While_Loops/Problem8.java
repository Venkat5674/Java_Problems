import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long fact = 1;  // use long to handle up to 20!
        int num = N;

        while (num > 1) {
            fact *= num;
            num--;
        }

        System.out.println(fact);
    }
}
