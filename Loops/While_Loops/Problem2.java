import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // input number
        int count = 0;

        // Count digits using while loop
        while (n > 0) {
            n = n / 10;   // divide number by 10
            count++;      // increase digit count
        }

        System.out.println(count);  // print number of digits
    }
}
