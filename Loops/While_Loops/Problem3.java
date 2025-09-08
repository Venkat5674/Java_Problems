import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int power = 1;  // start with 2^0 = 1

        while (power <= N) {
            System.out.print(power + " ");
            power = power * 2;  // keep doubling
        }
    }
}
