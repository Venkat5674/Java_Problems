import java.util.Scanner;

public class SmallestMultipleOf5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int num = N;

        // Keep increasing until a multiple of 5 is found
        while (num % 5 != 0) {
            num++;
        }

        System.out.println(num);
    }
}
